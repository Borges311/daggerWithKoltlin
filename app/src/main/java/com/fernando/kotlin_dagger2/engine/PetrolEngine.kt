package com.fernando.kotlin_dagger2.engine

import android.util.Log
import com.fernando.kotlin_dagger2.Car
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

/// Nesta abordagem, caso tenhamos mais de um parametro, precisamos informar no construtor

class PetrolEngine @Inject
                    constructor(@Named("horse_power")hp: Int,
                                @Named("engine_capacity")capacity: Int) : Engine {
    private var horsePower: Int = hp
    private var engineCapacity: Int = capacity

    override fun start() {
        Log.d(TAG, "Motor de petroleo Ligado. HP = $horsePower \n " +
                "Capacity =  $engineCapacity")
    }

    companion object{
        const val TAG = "Car"
    }
}