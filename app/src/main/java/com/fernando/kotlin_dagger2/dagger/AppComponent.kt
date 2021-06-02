package com.fernando.kotlin_dagger2.dagger

import com.fernando.kotlin_dagger2.driver.Driver
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {
    fun getActivityComponentFactory() : ActivityComponent.Factory
  //  fun getDriver() : Driver
}