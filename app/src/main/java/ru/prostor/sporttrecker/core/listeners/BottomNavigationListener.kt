package ru.prostor.sporttrecker.core.listeners

import android.content.Context
import android.content.Intent
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import ru.prostor.sporttrecker.BuildConfig
import ru.prostor.sporttrecker.R

class BottomNavigationListener(private var context: Context): BottomNavigationView.OnNavigationItemSelectedListener {

    companion object {
        private const val PACKAGE_NAME = "ru.prostor.fitnessroom"
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.fitness_room -> {
                Intent().setClassName(BuildConfig.APPLICATION_ID, "$PACKAGE_NAME.FRMainActivity")
                    .also { context.startActivity(it)}
            }
        }

        return true
    }
}