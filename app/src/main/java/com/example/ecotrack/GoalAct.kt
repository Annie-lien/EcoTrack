package com.example.ecotrack


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ProgressBar
import android.widget.Button
import android.widget.TextView

class GoalAct : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_goals)

        val progressText: TextView = findViewById(R.id.progressText)
        val progressBar: ProgressBar = findViewById(R.id.progressBar)
        progressBar.progress = 70 // Example progress value
        progressText.text = "70% Complete"

        val editGoalsButton: Button = findViewById(R.id.editGoalsButton)
        editGoalsButton.setOnClickListener {
            // Code to edit goals
        }
    }
}
