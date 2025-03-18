package com.example.lazytasks.repository


import com.example.lazytasks.model.Task
import java.time.LocalDate

fun getAllTasks(): List<Task> {
    return listOf(
        Task(
            id = 1,
            title = "Buy groceries",
            category = "Shopping",
            priority = "High",
            date = LocalDate.of(2025, 3, 18)
        ),
        Task(
            id = 2,
            title = "Finish Kotlin project",
            category = "Work",
            priority = "High",
            date = LocalDate.of(2024, 3, 20)
        ),
        Task(
            id = 3,
            title = "Workout for 30 minutes",
            category = "Health",
            priority = "Medium",
            date = LocalDate.of(2025, 3, 17)
        ),
        Task(
            id = 4,
            title = "Call mom",
            category = "Personal",
            priority = "High",
            date = LocalDate.of(2022, 3, 16)
        ),
        Task(
            id = 5,
            title = "Read a book",
            category = "Leisure",
            priority = "Low",
            date = LocalDate.of(2025, 3, 19)
        ),
        Task(
            id = 6,
            title = "Review code",
            category = "Work",
            priority = "Medium",
            date = LocalDate.of(2021, 3, 18)
        ),
        Task(
            id = 7,
            title = "Plan the next week",
            category = "Productivity",
            priority = "Medium",
            date = LocalDate.of(2025, 3, 21)
        ),
        Task(
            id = 8,
            title = "Clean the desk",
            category = "Chores",
            priority = "Low",
            date = LocalDate.of(2025, 3, 15)
        ),
        Task(
            id = 9,
            title = "Meditate",
            category = "Health",
            priority = "Low",
            date = LocalDate.of(2025, 3, 17)
        ),
        Task(
            id = 10,
            title = "Reply to emails",
            category = "Work",
            priority = "High",
            date = LocalDate.of(2025, 3, 18)
        )
    )
}

fun getTasksByCategory(category: String): List<Task> {
    return getAllTasks().filter {
        it.category.startsWith(prefix = category, ignoreCase = true)
    }
}
