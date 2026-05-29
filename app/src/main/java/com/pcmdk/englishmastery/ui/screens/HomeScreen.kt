package com.pcmdk.englishmastery.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.pcmdk.englishmastery.viewmodel.MasteryViewModel

@Composable
fun HomeScreen(navController: NavController, viewModel: MasteryViewModel) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text("English Mastery Coach", style = MaterialTheme.typography.headlineLarge)
        Text("Current Streak: ${viewModel.getStreak()} 🔥", style = MaterialTheme.typography.titleMedium)

        Button(onClick = { navController.navigate("daily") }) {
            Text("Start Today's Session")
        }
        Button(onClick = { navController.navigate("vocab") }) { Text("Vocabulary Engine") }
        Button(onClick = { navController.navigate("grammar") }) { Text("Grammar Engine") }
        Button(onClick = { navController.navigate("writing") }) { Text("Writing Practice") }
        Button(onClick = { navController.navigate("performance") }) { Text("Performance") }
    }
}