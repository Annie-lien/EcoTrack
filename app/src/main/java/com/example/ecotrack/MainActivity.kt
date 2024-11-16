package com.example.ecotrack

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_main)

        val totalWasteTextView: TextView = findViewById(R.id.totalWasteTextView)
        totalWasteTextView.text = "Total Waste Tracked: 150 kg"

        val quickLogButton: Button = findViewById(R.id.quickLogButton)
        quickLogButton.setOnClickListener {
            startActivity(Intent(this, LogWasteAct::class.java))
        }

        val goalsButton: Button = findViewById(R.id.goalsButton)
        goalsButton.setOnClickListener {
            startActivity(Intent(this, GoalAct::class.java))
        }

        val tipsResourcesButton: Button = findViewById(R.id.tipsResourcesButton)
        tipsResourcesButton.setOnClickListener {
            startActivity(Intent(this, TipsAndResAct::class.java))
        }

        val communityChallengesButton: Button = findViewById(R.id.communityChallengesButton)
        communityChallengesButton.setOnClickListener {
            startActivity(Intent(this, CommunityChallengesAct::class.java))
        }
    }
}