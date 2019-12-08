package ru.prostor.sporttrecker.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.main_activity.*
import ru.prostor.sporttrecker.R
import ru.prostor.sporttrecker.core.listeners.BottomNavigationListener

class MainActivityImpl: AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        main_b_navigation.setOnNavigationItemSelectedListener(BottomNavigationListener(this))
    }

}