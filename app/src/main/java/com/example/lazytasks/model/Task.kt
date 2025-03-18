package com.example.lazytasks.model

import java.time.LocalDate

data class Task(
    val id: Long = 0,
    val title: String = "",
    val category: String = "",
    val priority: String = "",
    val date: LocalDate = LocalDate.now()
)