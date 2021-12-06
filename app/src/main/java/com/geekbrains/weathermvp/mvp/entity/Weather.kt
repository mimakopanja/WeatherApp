package com.geekbrains.weathermvp.mvp.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize

data class Weather(
    val fact: Fact
): Parcelable