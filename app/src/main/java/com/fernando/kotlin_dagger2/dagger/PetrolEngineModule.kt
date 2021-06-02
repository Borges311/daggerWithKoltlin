package com.fernando.kotlin_dagger2.dagger

import com.fernando.kotlin_dagger2.engine.Engine
import com.fernando.kotlin_dagger2.engine.PetrolEngine
import dagger.Binds
import dagger.Module
import javax.inject.Singleton



@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun bindEngine(petrolEngine: PetrolEngine) : Engine

    /*
     @Provides
    fun provideEngine(petrolEngine: PetrolEngine) : Engine = petrolEngine
     */
}