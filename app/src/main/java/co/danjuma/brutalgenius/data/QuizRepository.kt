package co.danjuma.brutalgenius.data


    class QuizRepository {
        fun getSampleQuestions(): List<Question> {
            return listOf(
                Question(
                    "What is the capital of France?",
                    listOf("Berlin", "Madrid", "Paris", "Rome"),
                    "Paris"
                ),
                Question(
                    "Which planet is known as the Red Planet?",
                    listOf("Venus", "Mars", "Jupiter", "Saturn"),
                    "Mars"
                ),
                Question(
                    "What is the largest mammal on Earth?",
                    listOf("Elephant", "Blue Whale", "Giraffe", "Hippopotamus"),
                    "Blue Whale"
                ),
                // Add more questions as needed
            )
        }
    }
