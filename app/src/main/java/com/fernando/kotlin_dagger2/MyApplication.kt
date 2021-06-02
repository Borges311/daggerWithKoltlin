package com.fernando.kotlin_dagger2

import android.app.Application
import com.fernando.kotlin_dagger2.dagger.ActivityComponent
import com.fernando.kotlin_dagger2.dagger.AppComponent
import com.fernando.kotlin_dagger2.dagger.DaggerAppComponent

class MyApplication : Application() {
    // Criar um variável do tipo do componente, este caso o CarComponent
    private lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.create()
    }
    // Retorna o coponente já criado para a Activity
    fun getAppComponent() : AppComponent = component
}