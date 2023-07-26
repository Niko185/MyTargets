package com.example.mytargets.domain

data class Target(
    val name: String,
    val dayForFinish: Int,
    val isActive: Boolean,
    var id: Int = UNDEFINED_ID
){
    companion object {
        const val UNDEFINED_ID = -1
    }
}