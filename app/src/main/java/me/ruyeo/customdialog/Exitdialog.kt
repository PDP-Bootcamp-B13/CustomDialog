package me.ruyeo.customdialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.DialogFragment

class Exitdialog (private var title:String):DialogFragment(){

    var onItemClick:((Boolean)->Unit)?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.custom_layout,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var tv_text=view.findViewById<TextView>(R.id.tv_text)
        var tv_cancel=view.findViewById<TextView>(R.id.tv_no)
        var tv_yes=view.findViewById<TextView>(R.id.tv_yes)

        tv_text.text=title

        tv_cancel.setOnClickListener {
            dismiss()
        }

        tv_yes.setOnClickListener {
            onItemClick?.invoke(true)
            dismiss()
        }

    }

}