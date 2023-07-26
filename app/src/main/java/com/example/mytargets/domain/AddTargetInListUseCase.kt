package com.example.mytargets.domain

class AddTargetInListUseCase(private val targetRepository: TargetRepository) {

    fun addTargetInList(target: Target) {
        targetRepository.addTarget(target)
    }
}