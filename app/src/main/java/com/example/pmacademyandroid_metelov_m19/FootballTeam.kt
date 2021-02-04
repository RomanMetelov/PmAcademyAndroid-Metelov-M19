package com.example.pmacademyandroid_metelov_m19

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class FootballTeam(
    val id: Int,
    val logo: String,
    val name: String,
    val score: Int,
    val win: Int,
    val draw: Int,
    val loss: Int
) : Parcelable