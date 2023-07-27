package com.example.mytargets.domain

import androidx.lifecycle.LiveData

interface TargetRepository {

    fun addTarget(target: Target)

    fun deleteTarget(target: Target)

    fun editTarget(target: Target)

    fun getAllTargets(): LiveData<List<Target>>

    fun getTargetById(targetId: Int): Target

}