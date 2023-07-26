package com.example.mytargets.domain

class GetAllTargetsUseCase(private val targetRepository: TargetRepository) {

    fun getAllTargets(): List<Target> {
       return targetRepository.getAllTargets()
    }

}