package me.ruyeo.customdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
        val dialog=Exitdialog("Do you want to exit !!!!")
        dialog.onItemClick={
            finish()
        }
        dialog.show(supportFragmentManager," some ")
    }

}