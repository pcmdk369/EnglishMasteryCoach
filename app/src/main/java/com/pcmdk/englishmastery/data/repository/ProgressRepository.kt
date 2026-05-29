package com.pcmdk.englishmastery.data.repository

import com.pcmdk.englishmastery.data.model.DailySession
import com.pcmdk.englishmastery.data.model.UserPerformance

class ProgressRepository {
    private var currentStreak = 5
    private var performanceHistory = mutableListOf<UserPerformance>()

    fun getTodaySession(): DailySession {
        return DailySession(
            learningPlan = "Focus: Vocabulary (Layer 1) + Present Perfect Continuous + 150-word Writing",
            practiceTasks = listOf(
                "Learn 8 new words with IPA",
                "Master 1 grammar formula (3 examples)",
                "Write a 150-word professional email"
            ),
            metrics = UserPerformance(
                date = java.time.LocalDate.now().toString(),
                vocabRetention = 82.5f,
                grammarAccuracy = 91.0f,
                writingScore = 87.0f,
                streak = currentStreak,
                weakAreas = listOf("Advanced connectors")
            )
        )
    }

    fun savePerformance(performance: UserPerformance) {
        performanceHistory.add(performance)
    }

    fun getStreak(): Int = currentStreak
}