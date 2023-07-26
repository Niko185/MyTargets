package com.example.mytargets.domain

class GetTargetByIdUseCase(private val targetRepository: TargetRepository) {

    fun getTargetById(targetId: Int): Target {
       return targetRepository.getTargetById(targetId)
    }
}