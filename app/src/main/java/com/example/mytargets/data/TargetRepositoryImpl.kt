package com.example.mytargets.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mytargets.domain.Target
import com.example.mytargets.domain.TargetRepository

object TargetRepositoryImpl : TargetRepository {
    private val targetList = mutableListOf<Target>()
    private val targetListLD = MutableLiveData<List<Target>>()
    private var  autoIncrementId = 0

    init {
        for(index in 0 until 10){
            val itemTarget = Target(
                name = "Name $index",
                dayForFinish = index,
                isActive = true
                )
            addTarget(itemTarget)
        }
    }

    override fun addTarget(target: Target) {
        if(target.id == -1) {
            target.id = autoIncrementId++
        }
            targetList.add(target)
            updateTargetList()
    }

    override fun deleteTarget(target: Target) {
        targetList.remove(target)
        updateTargetList()
    }

    override fun editTarget(target: Target) {
        val oldTarget = getTargetById(target.id)

        targetList.remove(oldTarget)
        addTarget(target)
    }

    override fun getAllTargets(): LiveData<List<Target>> {
        return targetListLD
    }

    override fun getTargetById(targetId: Int): Target {
        return targetList.find { it.id == targetId
        } ?: throw RuntimeException("Target $targetId not found")
    }

    private fun updateTargetList(){
        targetListLD.value = targetList.toList()
    }
}