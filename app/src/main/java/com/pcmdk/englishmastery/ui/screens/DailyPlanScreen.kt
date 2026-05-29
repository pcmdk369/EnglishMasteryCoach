package com.pcmdk.englishmastery.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import com.pcmdk.englishmastery.viewmodel.MasteryViewModel

@Composable
fun DailyPlanScreen(viewModel: MasteryViewModel) {
    val session = viewModel.currentSession.value

    Column(modifier = Modifier.padding(16.dp)) {
        Text("📅 Today's Learning Plan", style = MaterialTheme.typography.headlineMedium)
        Text(session.learningPlan)

        Spacer(Modifier.height(24.dp))
        Text("Practice Tasks:", style = MaterialTheme.typography.titleLarge)

        session.practiceTasks.forEach { task ->
            Text("• $task", modifier = Modifier.padding(vertical = 4.dp))
        }

        Button(onClick = { /* Start practice */ }) {
            Text("Begin Practice")
        }
    }
}