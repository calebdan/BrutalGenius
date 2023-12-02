package co.danjuma.brutalgenius.data

data class Question(
    val questionText: String,
    val answers: List<String>,
    val correctAnswer: String)