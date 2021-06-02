package com.fernando.kotlin_dagger2.dagger

import com.fernando.kotlin_dagger2.Car
import com.fernando.kotlin_dagger2.MainActivity
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named

// Responsável por montar o motor e Rodas

@PerActivity
@Subcomponent(modules = [WhelsModule::class, PetrolEngineModule::class])
interface ActivityComponent {

    fun getCar() : Car
    fun inject(mainActivity: MainActivity)

    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance @Named("horse_power") horsePower: Int,
                  @BindsInstance  @Named("engine_capacity")engineCapacity: Int) : ActivityComponent
    }

    /*
    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@Named("horse_power") horsePower: Int) : Builder

        @BindsInstance
        fun engineCapacity(@Named("engine_capacity")engineCapacity: Int) : Builder

        //fun appComponent(component: AppComponent) : Builder

        fun build() : ActivityComponent
    }
    */


}