package com.pcmdk.englishmastery.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.pcmdk.englishmastery.data.model.DailySession
import com.pcmdk.englishmastery.data.repository.ProgressRepository

class MasteryViewModel : ViewModel() {
    private val repository = ProgressRepository()
    var currentSession = mutableStateOf(repository.getTodaySession())
        private set

    fun updateWritingScore(newScore: Float) {
        currentSession.value = currentSession.value.copy(
            metrics = currentSession.value.metrics.copy(writingScore = newScore)
        )
    }

    fun getStreak() = repository.getStreak()
}