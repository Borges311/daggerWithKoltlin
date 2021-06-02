package com.fernando.kotlin_dagger2.engine

import android.util.Log
import com.fernando.kotlin_dagger2.Car
import javax.inject.Inject

// Injeção em tempo de Execução

class DieselEngine(hp: Int) : Engine {
    private var horsePower: Int = hp

    override fun start() {
        Log.d(TAG, "Motor Diesel Ligado. HP = $horsePower")
    }

    companion object{
        const val TAG = "Car"
    }
}