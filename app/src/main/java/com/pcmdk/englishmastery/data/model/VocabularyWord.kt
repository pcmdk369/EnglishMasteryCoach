package com.pcmdk.englishmastery.data.model

data class VocabularyWord(
    val id: String,
    val word: String,
    val ipa: String,
    val meaning: String,
    val synonyms: List<String>,
    val exampleSentences: List<String>,
    val difficulty: Int, // 1 = high-frequency, 5 = rare
    val retentionRate: Float = 0.0f
)