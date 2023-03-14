package ru.netology.quizapp

object Const {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.flag_albaniya_enl,
            "Albania",
            "Australia",
            "Hungary",
            "Montenegro",
            1
        )
        questionsList.add(que1)


        val que2 = Question(
            1, "What country does this flag belong to?",
            R.drawable.flag_algir_enl,
            "Alger",
            "Australia",
            "Hungary",
            "Montenegro",
            1
        )
        questionsList.add(que2)


        val que3 = Question(
            1, "What country does this flag belong to?",
            R.drawable.flag_angola_enl,
            "Angola",
            "Australia",
            "Hungary",
            "Montenegro",
            1
        )
        questionsList.add(que3)


        val que4 = Question(
            1, "What country does this flag belong to?",
            R.drawable.flag_argentina_enl,
            "Albania",
            "Argentina",
            "Hungary",
            "Montenegro",
            2
        )
        questionsList.add(que4)


        val que5 = Question(
            1, "What country does this flag belong to?",
            R.drawable.flag_armeniya_new,
            "Albania",
            "Australia",
            "Hungary",
            "Armenia",
            4
        )
        questionsList.add(que5)


        val que6 = Question(
            1, "What country does this flag belong to?",
            R.drawable.flag_avstraliya_enl,
            "Albania",
            "Australia",
            "Hungary",
            "Montenegro",
            2
        )
        questionsList.add(que6)


        val que7 = Question(
            1, "What country does this flag belong to?",
            R.drawable.flag_avstriya_enl,
            "Albania",
            "Australia",
            "Austria",
            "Montenegro",
            3
        )
        questionsList.add(que7)


        val que8 = Question(
            1, "What country does this flag belong to?",
            R.drawable.flag_azerbaidzan_enl,
            "Azerbaijan",
            "Australia",
            "Hungary",
            "Montenegro",
            1
        )
        questionsList.add(que8)


        val que9 = Question(
            1, "What country does this flag belong to?",
            R.drawable.flag_england1,
            "Albania",
            "Australia",
            "England",
            "Montenegro",
            3
        )
        questionsList.add(que9)


        val que10 = Question(
            1, "What country does this flag belong to?",
            R.drawable.flag_rf_enl,
            "Albania",
            "Australia",
            "Hungary",
            "Russia",
            4
        )
        questionsList.add(que10)

        return questionsList
    }
}