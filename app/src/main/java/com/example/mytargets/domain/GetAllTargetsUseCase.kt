package com.example.mytargets.domain

import androidx.lifecycle.LiveData

class GetAllTargetsUseCase(private val targetRepository: TargetRepository) {

    fun getAllTargets(): LiveData<List<Target>> {
       return targetRepository.getAllTargets()
    }

}