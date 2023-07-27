package com.example.mytargets.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mytargets.data.TargetRepositoryImpl
import com.example.mytargets.domain.DeleteTargetFromListUseCase
import com.example.mytargets.domain.EditTargetUseCase
import com.example.mytargets.domain.GetAllTargetsUseCase
import com.example.mytargets.domain.Target

class MainViewModel: ViewModel() {

    private val repository = TargetRepositoryImpl

    private val getAllTargetUseCase = GetAllTargetsUseCase(repository)
    private val deleteTargetUseCase = DeleteTargetFromListUseCase(repository)
    private val editTargetUseCase = EditTargetUseCase(repository)

    val targetList = getAllTargetUseCase.getAllTargets()


    fun deleteTarget(target: Target) {
        deleteTargetUseCase.deleteTargetFromList(target)
    }

    fun changeIsActiveState(target: Target) {
        val newItem = target.copy(isActive = !target.isActive)
        editTargetUseCase.editTarget(newItem)
    }


}