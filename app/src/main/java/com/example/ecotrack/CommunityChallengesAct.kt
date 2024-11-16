package com.example.ecotrack


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class CommunityChallengesAct : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_community_challenges)

        val challengesTextView: TextView = findViewById(R.id.challengesTextView)


        challengesTextView.text = "Join the 'Plastic-Free Week' challenge to reduce plastic usage."
    }
}