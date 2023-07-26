package com.example.mytargets.domain

class DeleteTargetFromListUseCase(private val targetRepository: TargetRepository) {

    fun deleteTargetFromList(target: Target) {
        targetRepository.deleteTarget(target)
    }
}