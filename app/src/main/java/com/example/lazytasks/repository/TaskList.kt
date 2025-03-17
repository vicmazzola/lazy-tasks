package com.example.lazytasks.repository


import com.example.lazytasks.model.Task


fun getAllTasks(): List<Task> {
    return listOf(
        Task(id = 1, title = "Buy groceries", category = "Shopping", priority = "High"),
        Task(id = 2, title = "Finish Kotlin project", category = "Work", priority = "High"),
        Task(id = 3, title = "Workout for 30 minutes", category = "Health", priority = "Medium"),
        Task(id = 4, title = "Call mom", category = "Personal", priority = "High"),
        Task(id = 5, title = "Read a book", category = "Leisure", priority = "Low"),
        Task(id = 6, title = "Review code", category = "Work", priority = "Medium"),
        Task(id = 7, title = "Plan the next week", category = "Productivity", priority = "Medium"),
        Task(id = 8, title = "Clean the desk", category = "Chores", priority = "Low"),
        Task(id = 9, title = "Meditate", category = "Health", priority = "Low"),
        Task(id = 10, title = "Reply to emails", category = "Work", priority = "High")
    )
}

fun getTasksByCategory(category: String): List<Task> {
    return getAllTasks().filter {
        it.category.equals(category, ignoreCase = true)
    }
}
