package ru.prostor.fitnessroom.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import ru.prostor.fitnessroom.R
import ru.prostor.fitnessroom.core.listeners.ApproachListener

class ApproachFragment: Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.approach_fragment, container, false)

        val approachListener = ApproachListener(view)

        view.findViewById<Button>(R.id.approach_plus).setOnClickListener(approachListener)
        view.findViewById<Button>(R.id.approach_minus).setOnClickListener(approachListener)

        return view
    }
}