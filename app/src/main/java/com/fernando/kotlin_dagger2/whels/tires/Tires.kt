package com.fernando.kotlin_dagger2.whels.tires

import android.util.Log

class Tires {

    fun inflate() {
        Log.d(TAG, "Pneus Inflando")
    }

    companion object{
        const val TAG = "Car"
    }
}
