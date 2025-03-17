package com.example.lazytasks.model

data class Task(
    val id: Long = 0,
    val title: String = "",
    val category: String = "",
    val priority: String = ""
)