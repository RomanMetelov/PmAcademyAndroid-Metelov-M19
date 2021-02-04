package com.example.pmacademyandroid_metelov_m19

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.pmacademyandroid_metelov_m19.databinding.ActivityRecyclerViewEplBinding
import com.example.pmacademyandroid_metelov_m19.databinding.RecyclerViewEplItemBinding

class RecyclerViewEPLAdapter(private val items: List<FootballTeam>) :
    RecyclerView.Adapter<RecyclerViewEPLAdapter.FootballTeamViewHolder>() {

    inner class FootballTeamViewHolder(private val binding: RecyclerViewEplItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(footballTeam: FootballTeam) {
            binding.tvItemId.text = footballTeam.id.toString()
            Glide.with(binding.root.context)
                .load(footballTeam.logo)
                .circleCrop()
                .into(binding.ivFootballTeamLogo)
            binding.tvFootballTeamName.text = footballTeam.name
            binding.tvfootballTeamScore.text = footballTeam.score.toString()
            binding.root.setOnClickListener {
                FootballTeamProfileActivity.start(
                    binding.root.context,
                    binding.ivFootballTeamLogo,
                    binding.tvFootballTeamName,
                    footballTeam
                )
            }
        }
    }

    override fun onBindViewHolder(
        holder: RecyclerViewEPLAdapter.FootballTeamViewHolder,
        position: Int
    ) {
        val footballTeam = items[position]
        holder.bind(footballTeam)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FootballTeamViewHolder {
        val binding =
            RecyclerViewEplItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FootballTeamViewHolder(binding)
    }

    override fun getItemCount(): Int = items.size
}