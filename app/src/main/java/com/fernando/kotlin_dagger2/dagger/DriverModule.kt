package com.fernando.kotlin_dagger2.dagger

import com.fernando.kotlin_dagger2.driver.Driver
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DriverModule {

    @Provides
    @Singleton
    fun provideDriver(): Driver = Driver()

}