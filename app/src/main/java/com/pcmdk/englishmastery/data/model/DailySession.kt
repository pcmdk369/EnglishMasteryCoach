package com.pcmdk.englishmastery.data.model

data class DailySession(
    val learningPlan: String,
    val practiceTasks: List<String>,
    val feedback: String = "",
    val metrics: UserPerformance
)