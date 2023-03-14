package ru.netology.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val username = intent.getStringExtra(Const.USER_NAME)
        tvName.text = username
        val totalQuestions = intent.getIntExtra(Const.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Const.CORRECT_ANSWERS, 0)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        tvScore.text = "Your Score is $correctAnswers out of $totalQuestions"

        finishBtn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}