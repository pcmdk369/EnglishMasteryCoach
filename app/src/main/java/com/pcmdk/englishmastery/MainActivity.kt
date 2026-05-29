package com.pcmdk.englishmastery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pcmdk.englishmastery.ui.screens.*
import com.pcmdk.englishmastery.ui.theme.EnglishMasteryTheme
import com.pcmdk.englishmastery.viewmodel.MasteryViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = MasteryViewModel()

        setContent {
            EnglishMasteryTheme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "home") {
                    composable("home") { HomeScreen(navController, viewModel) }
                    composable("daily") { DailyPlanScreen(viewModel) }
                    composable("vocab") { VocabularyScreen(viewModel) }
                    composable("grammar") { GrammarScreen(viewModel) }
                    composable("writing") { WritingScreen(viewModel) }
                    composable("performance") { PerformanceScreen(viewModel) }
                }
            }
        }
    }
}