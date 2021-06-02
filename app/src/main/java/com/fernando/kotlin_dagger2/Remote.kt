package com.fernando.kotlin_dagger2

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {


    fun setListener(car: Car){
        Log.d(TAG, "Controle remoto conectado")
    }


    companion object{
        const val TAG = "Car"
    }
}
