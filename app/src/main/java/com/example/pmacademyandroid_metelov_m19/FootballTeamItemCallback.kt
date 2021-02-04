package com.example.pmacademyandroid_metelov_m19

import androidx.recyclerview.widget.DiffUtil

class FootballTeamItemCallback  : DiffUtil.ItemCallback<FootballTeam>() {
    override fun areItemsTheSame(oldItem: FootballTeam, newItem: FootballTeam): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: FootballTeam, newItem: FootballTeam): Boolean {
        return oldItem == newItem
    }
}