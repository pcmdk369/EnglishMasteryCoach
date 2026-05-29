package com.pcmdk.englishmastery.data.model

data class GrammarFormula(
    val id: String,
    val formula: String,
    val name: String,
    val explanation: String,
    val examples: List<String> // Exactly 3 examples
)