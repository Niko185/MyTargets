package com.example.mytargets.data

import com.example.mytargets.domain.Target
import com.example.mytargets.domain.TargetRepository

object TargetRepositoryImpl : TargetRepository {
    private val targetList = mutableListOf<Target>()
    private var  autoIncrementId = 0

    override fun addTarget(target: Target) {
        if(target.id == -1) {
            target.id = autoIncrementId++
        }
            targetList.add(target)
    }

    override fun deleteTarget(target: Target) {
        targetList.remove(target)
    }

    override fun editTarget(target: Target) {
        val oldTarget = getTargetById(target.id)

        targetList.remove(oldTarget)
        addTarget(target)
    }

    override fun getAllTargets(): List<Target> {
        return targetList.toList()
    }

    override fun getTargetById(targetId: Int): Target {
        return targetList.find { it.id == targetId
        } ?: throw RuntimeException("Target $targetId not found")
    }

}