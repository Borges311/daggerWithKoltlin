package com.fernando.kotlin_dagger2

import android.util.Log
import com.fernando.kotlin_dagger2.dagger.PerActivity
import com.fernando.kotlin_dagger2.driver.Driver
import com.fernando.kotlin_dagger2.engine.Engine
import com.fernando.kotlin_dagger2.whels.Whels
import javax.inject.Inject

/*
    Injetar as dependencias no construtor da classe
 */

@PerActivity
class Car @Inject constructor(
    private val engine: Engine,
    private val whels: Whels,
    private val driver: Driver){ // Constructor injection

  //  @Inject lateinit var engine: Engine // Field Injection

    fun drive(){
        engine.start()
        Log.d(TAG, "Driver $driver = drives $this")
    }


    // Injeção por metodo, executa após a execução do construtor da classe
    // não é preciso chamar esse metodo pois o Dagger faz isso automatico
    @Inject fun enableRemote(remote: Remote){
        remote.setListener(this)
    }


    companion object{
        const val TAG = "Car"
    }

    /*
    class Car @Inject constructor(
    private val engine: Engine,
    private val whels: Whels)
     */
}
