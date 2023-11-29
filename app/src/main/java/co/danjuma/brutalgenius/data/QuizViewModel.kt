package co.danjuma.brutalgenius.data

import androidx.lifecycle.ViewModel
import java.util.Timer

class QuizViewModel: ViewModel() {

    //Question for the quiz
    private val questions = mutableListOf<Question>()

    private var currentQuestionIndex =0


    //Timer Variables
    private var timer: Timer? = null
    private var secondsRemaining= 0

    //Callback to update UI
    var onGameUpdate:((Question, Int) -> Unit)? = null

    init {
        loadQuestion()
    }

    private fun loadQuestion() {
        TODO("Not yet implemented")
    }


}