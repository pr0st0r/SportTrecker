package ru.prostor.fitnessroom.core.listeners

import android.text.Editable
import android.view.View
import android.widget.EditText
import ru.prostor.fitnessroom.R

class ApproachListener(layout: View?): View.OnClickListener{

    private val approachCountView = layout?.findViewById<EditText>(R.id.approach_count)

    override fun onClick(view: View?) {
        when (view?.id){
            R.id.approach_minus -> {
                val approachCount = Integer.parseInt(approachCountView?.text.toString())
                if(approachCount > 0){
                    approachCountView?.text = Editable.Factory.getInstance().newEditable((approachCount - 1).toString())
                }
            }
            R.id.approach_plus -> {
                val approachCount = Integer.parseInt(approachCountView?.text.toString())
                approachCountView?.text = Editable.Factory.getInstance().newEditable((approachCount + 1).toString())
            }
        }
    }
}
