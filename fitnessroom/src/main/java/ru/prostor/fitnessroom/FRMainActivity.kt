package ru.prostor.fitnessroom

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation

class FRMainActivity: AppCompatActivity() {

    private val navController by lazy{
        Navigation.findNavController(this, R.id.FRMainActivityNavController)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fr_main_activity)
    }

    /**
     * Выбрать подходы
     */
    fun goApproach(view: View){
        navController.navigate(R.id.approachFragment)
    }

    /**
     * Переход к процессу
     */
    fun start(view: View){
        navController.navigate(R.id.startActionFragment)
    }
}