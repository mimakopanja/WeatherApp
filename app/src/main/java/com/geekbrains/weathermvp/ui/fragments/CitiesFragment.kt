package com.geekbrains.weathermvp.ui.fragments

import com.geekbrains.weathermvp.databinding.FragmentCitiesBinding
import com.geekbrains.weathermvp.mvp.view.CitiesView
import moxy.MvpAppCompatFragment

class CitiesFragment: MvpAppCompatFragment(), CitiesView {

    companion object{
        fun newInstance() = CitiesFragment()
    }

    private lateinit var binding: FragmentCitiesBinding

    override fun init() {

    }


}