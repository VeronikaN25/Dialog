package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

const val TAG_FRAGMENT = "Tag_Dialog_fragment"

class MainActivity : AppCompatActivity(), OnClickFragment {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentDialog = ShowAlertDialog.newInstance(
            label = "This text for Alert Dialog",
            image = R.drawable.dialog
        )
        fragmentDialog.show(supportFragmentManager, TAG_FRAGMENT)
//        showAlertDialog()
    }
    private fun showAlertDialog(){
        val alertDialog = resources.getDrawable(R.drawable.alert_dialog)
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
        dialog.window?.setBackgroundDrawable(alertDialog)
        dialog.show()
    }

    override fun clickOk() {
        Toast.makeText(this,"Press ok",Toast.LENGTH_SHORT).show()
    }

    override fun clickCancel() {
        Toast.makeText(this,"Press cancel",Toast.LENGTH_SHORT).show()
    }
}