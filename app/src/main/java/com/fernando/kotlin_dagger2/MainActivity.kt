package com.fernando.kotlin_dagger2

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fernando.kotlin_dagger2.dagger.DieselEngineModule

import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject lateinit var car1 :Car
    @Inject lateinit var car2 :Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = (application as MyApplication).getAppComponent()
          .getActivityComponentFactory().create(
                150,
                1000)

        component.inject(this)
        car1.drive()
        car2.drive()

    }
}