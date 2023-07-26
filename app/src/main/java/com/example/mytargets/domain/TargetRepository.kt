package com.example.mytargets.domain

interface TargetRepository {

    fun addTarget(target: Target)

    fun deleteTarget(target: Target)

    fun editTarget(target: Target)

    fun getAllTargets(): List<Target>

    fun getTargetById(targetId: Int): Target

}