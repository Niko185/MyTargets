package com.example.mytargets.domain

data class Target(
    val id: Int,
    val name: String,
    val dayForFinish: Int,
    val isActive: Boolean
)
