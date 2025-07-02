package com.mosiuk.englishwordsapp

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.mosiuk.englishwordsapp.databinding.ActivityLearnWordBinding

class MainActivity : AppCompatActivity() {

//    private lateinit var binding: ActivityLearnWordBinding

    private var _binding: ActivityLearnWordBinding? = null
    private val binding
        get() = _binding ?: throw IllegalStateException("Binding for ActivityLearnWordBinding must not be null")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityLearnWordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // findViewById
        // viewBinding

//        val tvQuestionWord: TextView = findViewById(R.id.tvQuestionWord)
//
//        tvQuestionWord.text = "666"
//        tvQuestionWord.setTextColor(Color.RED)
//        tvQuestionWord.setTextColor(Color.parseColor("#FDD600"))
//        tvQuestionWord.setTextColor(ContextCompat.getColor(this, R.color.buttonBlueColor))

        with(binding) {
            tvQuestionWord.text = "EnglishWordsApp"
            tvQuestionWord.setTextColor(Color.RED)
            tvQuestionWord.isVisible = true

        }
    }
}