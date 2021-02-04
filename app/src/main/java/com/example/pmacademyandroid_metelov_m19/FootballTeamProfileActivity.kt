package com.example.pmacademyandroid_metelov_m19

import android.app.Activity
import android.app.ActivityOptions
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.util.toAndroidPair
import com.bumptech.glide.Glide
import com.example.pmacademyandroid_metelov_m19.databinding.ActivityFootballTeamProfileBinding

class FootballTeamProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFootballTeamProfileBinding

    companion object {
        private const val FOOTBALL_TEAM_KEY = "FOOTBALL_TEAM_KEY"

        fun start(context: Context, logo: ImageView, name: TextView, team: FootballTeam) {
            val pairIcon = Pair<View, String>(
                logo,
                context.getString(R.string.team_name_transition)
            ).toAndroidPair()
            val pairName = Pair<View, String>(
                name,
                context.getString(R.string.team_logo_transition)
            ).toAndroidPair()
            Intent(context, FootballTeamProfileActivity::class.java).apply {
                putExtra(FOOTBALL_TEAM_KEY, team)
                context.startActivity(
                    this,
                    ActivityOptions.makeSceneTransitionAnimation(
                        context as Activity,
                        pairIcon,
                        pairName
                    ).toBundle()
                )
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
        setupViews()
        setupOnClickListeners()
    }

    private fun setupBinding() {
        binding = ActivityFootballTeamProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setupViews() {
        val team: FootballTeam? = intent.getParcelableExtra(FOOTBALL_TEAM_KEY)
        Glide.with(this)
            .load(team?.logo)
            .circleCrop()
            .placeholder(R.drawable.ic_launcher_foreground)
            .into(binding.ivFootballTeamLogo)
        binding.tvFootballTeamName.text = team?.name
        binding.tvWinFootballTeamStats.text = team?.win.toString()
        binding.tvDrawFootballTeamStats.text = team?.draw.toString()
        binding.tvLossFootballTeamStats.text = team?.loss.toString()
    }

    private fun setupOnClickListeners() {
        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }

}