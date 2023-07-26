package com.example.mytargets.domain

class EditTargetUseCase(private val targetRepository: TargetRepository) {

    fun editTarget(target: Target) {
        targetRepository.editTarget(target)
    }

}