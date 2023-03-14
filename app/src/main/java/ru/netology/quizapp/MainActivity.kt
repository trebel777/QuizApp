package ru.netology.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var startBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        startBtn = findViewById(R.id.startBtn)

        startBtn.setOnClickListener {
            if (editNickname.text.toString().isEmpty()) {
                Toast.makeText(this, " Please enter your nickname", Toast.LENGTH_SHORT).show()

            } else {
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra(Const.USER_NAME, editNickname.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}