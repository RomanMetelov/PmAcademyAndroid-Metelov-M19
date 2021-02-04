package com.example.pmacademyandroid_metelov_m19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pmacademyandroid_metelov_m19.databinding.ActivityRecyclerViewEplBinding

class RecyclerViewEPLActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecyclerViewEplBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
        setupRecyclerView()
    }

    private fun setupBinding() {
        binding = ActivityRecyclerViewEplBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setupRecyclerView() {
        val eplTeamsList = initEplTeams()
        binding.rvEpl.run {
            adapter = RecyclerViewEPLAdapter(eplTeamsList)
            layoutManager = LinearLayoutManager(this@RecyclerViewEPLActivity)
            addItemDecoration(
                DividerItemDecoration(this@RecyclerViewEPLActivity, RecyclerView.VERTICAL)
           )
        }
    }

    private fun initEplTeams() = listOf(
        FootballTeam(
            1, "https://a.espncdn.com/i/teamlogos/soccer/500/382.png",
            "Manchester City", 44, 13, 5, 2
        ),
        FootballTeam(
            2, "https://a.espncdn.com/i/teamlogos/soccer/500/360.png",
            "Manchester United", 44, 13, 5, 4
        ),
        FootballTeam(
            3, "https://a.espncdn.com/i/teamlogos/soccer/500/364.png",
            "Liverpool", 40, 11, 7, 3
        ),
        FootballTeam(
            4, "https://a.espncdn.com/i/teamlogos/soccer/500/375.png",
            "Leicester City", 39, 12, 3, 6
        ),
        FootballTeam(
            5, "https://a.espncdn.com/i/teamlogos/soccer/500/371.png",
            "West Ham United", 35, 10, 5, 6
        ),
        FootballTeam(
            6, "https://a.espncdn.com/i/teamlogos/soccer/500/367.png",
            "Tottenham Hotspur", 33, 9, 6, 5
        ),
        FootballTeam(
            7, "https://a.espncdn.com/i/teamlogos/soccer/500/363.png",
            "Chelsea", 33, 9, 6, 6
        ),
        FootballTeam(
            8, "https://a.espncdn.com/i/teamlogos/soccer/500/368.png",
            "Everton", 33, 10, 3, 6
        ),
        FootballTeam(
            9, "https://a.espncdn.com/i/teamlogos/soccer/500/362.png",
            "Aston Villa", 32, 10, 2, 7
        ),
        FootballTeam(
            10, "https://a.espncdn.com/i/teamlogos/soccer/500/359.png",
            "Arsenal", 31, 9, 4, 9
        ),
        FootballTeam(
            11, "https://a.espncdn.com/i/teamlogos/soccer/500/357.png",
            "Leeds United", 29, 9, 2, 9
        ),
        FootballTeam(
            12, "https://a.espncdn.com/i/teamlogos/soccer/500/376.png",
            "Southampton", 29, 8, 5, 8
        ),
        FootballTeam(
            13, "https://a.espncdn.com/i/teamlogos/soccer/500/384.png",
            "Crystal Palace", 29, 8, 5, 9
        ),
        FootballTeam(
            14, "https://a.espncdn.com/i/teamlogos/soccer/500/380.png",
            "Wolverhampton Wanderers", 26, 7, 5, 10
        ),
        FootballTeam(
            15, "https://a.espncdn.com/i/teamlogos/soccer/500/379.png",
            "Burnley", 22, 6, 4, 10
        ),
        FootballTeam(
            16, "https://a.espncdn.com/i/teamlogos/soccer/500/361.png",
            "Newcastle United", 22, 6, 4, 12
        ),
        FootballTeam(
            17, "https://a.espncdn.com/i/teamlogos/soccer/500/331.png",
            "Brighton and Hove Albion", 21, 4, 9, 8
        ),
        FootballTeam(
            18, "https://a.espncdn.com/i/teamlogos/soccer/500/370.png",
            "Fulham", 14, 2, 8, 10
        ),
        FootballTeam(
            19, "https://a.espncdn.com/i/teamlogos/soccer/500/383.png",
            "West Bromwich Albion", 12, 2, 6, 14
        ),
        FootballTeam(
            20, "https://a.espncdn.com/i/teamlogos/soccer/500/398.png",
            "Sheffield United", 11, 3, 2, 17
        )
    )
}