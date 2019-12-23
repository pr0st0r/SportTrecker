package ru.prostor.fitnessroom.core.listeners

import android.text.Editable
import android.view.View
import android.widget.EditText
import ru.prostor.fitnessroom.R

class ApproachListener(var layout: View?): View.OnClickListener{
    override fun onClick(view: View?) {
        when (view?.id){
            R.id.approach_minus -> {

            }
            R.id.approach_plus -> {
                val approachCountView = layout?.findViewById<EditText>(R.id.approach_count)
                val approachCount = Integer.parseInt(approachCountView?.text.toString())
                approachCountView?.text = Editable.Factory.getInstance().newEditable((approachCount + 1).toString())
            }
        }
    }
}
