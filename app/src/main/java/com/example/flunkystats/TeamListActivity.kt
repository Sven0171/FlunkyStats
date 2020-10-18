package com.example.flunkystats

import android.os.Bundle
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_team_list.*

class TeamListActivity : ListActivity() {

    override val targetStatsActivity: Class<*>
        get() = TeamStatsActivity::class.java
    override val dataRef: DatabaseReference
        get() = Firebase.database.reference.child("Teams")
    override val targetButtonLayout: ViewGroup
        get() = llTeamList
    override val rootLayout: ConstraintLayout
        get() = findViewById(R.id.tlaConstLayout)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_list)

        //loads Player data and creates a button for each player
        loadEntries()

        //set on click listener for floating action button "add Player"
        fabAddTeam.setOnClickListener {
            //open the add player alert dialog
            openAddEntryDialog(getString(R.string.addTeamDialogTitle), getString(R.string.addTeamDialogHint))
        }

    }
}