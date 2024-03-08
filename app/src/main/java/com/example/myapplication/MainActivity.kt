package com.example.myapplication

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showAlertDialog()
    }
    private fun showAlertDialog(){
        val alert_dialog = resources.getDrawable(R.drawable.alert_dialog)
        val builder = AlertDialog.Builder(this)
        val dialog=builder
           .setView(R.layout.alert_dialog)
           .setPositiveButton("Confirm"){dialog, _ ->
               dialog.cancel()
           }
           .setNegativeButton("Dismiss") { dialog, _ ->
               dialog.cancel()
           }
           .create()
        dialog.window?.setBackgroundDrawable(alert_dialog)
        dialog.show()

    }
}