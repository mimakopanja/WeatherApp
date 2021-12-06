package com.geekbrains.weathermvp.ui.network

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Single

interface INetworkStatus {
    fun inOnline(): Observable<Boolean>
    fun isOnlineSingle(): Single<Boolean>
}