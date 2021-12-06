package com.geekbrains.weathermvp.mvp.presenter

import com.geekbrains.weathermvp.mvp.view.CitiesView
import io.reactivex.rxjava3.core.Scheduler
import moxy.MvpPresenter

class CitiesPresenter(val uiScheduler: Scheduler): MvpPresenter<CitiesView>() {

}