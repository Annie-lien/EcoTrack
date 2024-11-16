package com.example.ecotrack

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView

class TipsAndResAct : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_tips_res)

        val searchEditText: EditText = findViewById(R.id.searchEditText)
        val articleTextView: TextView = findViewById(R.id.articleTextView)

        // Mock data display for the articles
        articleTextView.text = "Reducing Plastic Waste: Tips on minimizing plastic usage."
    }
}
