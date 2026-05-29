package com.pcmdk.englishmastery.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import com.pcmdk.englishmastery.data.model.VocabularyWord
import com.pcmdk.englishmastery.viewmodel.MasteryViewModel

val sampleWords = listOf(
    VocabularyWord("1", "ephemeral", "/ɪˈfem.ər.əl/", "lasting for a very short time", listOf("transient", "fleeting"), listOf("The beauty of the sunset was ephemeral."), 3)
)

@Composable
fun VocabularyScreen(viewModel: MasteryViewModel) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Vocabulary Engine", style = MaterialTheme.typography.headlineMedium)

        sampleWords.forEach { word ->
            Card(modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text("${word.word} ${word.ipa}", style = MaterialTheme.typography.titleLarge)
                    Text("Meaning: ${word.meaning}")
                    Text("Synonyms: ${word.synonyms.joinToString()}")
                    Text("Example: ${word.exampleSentences[0]}")
                }
            }
        }
    }
}