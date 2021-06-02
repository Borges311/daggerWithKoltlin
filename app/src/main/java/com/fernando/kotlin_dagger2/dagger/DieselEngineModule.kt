package com.fernando.kotlin_dagger2.dagger

import com.fernando.kotlin_dagger2.engine.DieselEngine
import com.fernando.kotlin_dagger2.engine.Engine
import dagger.Binds
import dagger.Module
import dagger.Provides

/*
 Não usar o @Binds para Injeção em execução em tempo real


 */

@Module
class DieselEngineModule(hp: Int) {
    private var horsePower: Int = hp

    @Provides
    fun provideEngine() : Engine {
        return DieselEngine(horsePower)
    }

}