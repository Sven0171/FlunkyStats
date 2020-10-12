package com.example.flunkystats

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.team_stats.*

class TeamStatsActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.team_stats)

        val team = intent.getStringExtra(EXTRA_MESSAGE_TEAM)

        if(team != null) {
            Log.d("Sven", team.toString())

            findViewById<TextView>(R.id.tvTName).apply {
                text = team;
            }
        }

    }

}