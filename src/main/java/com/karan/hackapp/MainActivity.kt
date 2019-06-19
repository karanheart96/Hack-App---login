package com.karan.hackapp

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val message = "Username:" + intent.getStringExtra("Username") + "\nPassword : " +
                intent.getStringExtra("Password")
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setTitle("Sensitive data was accessed!")
            .setMessage(message)
            .setCancelable(false)
            .setNegativeButton("OK") {
                dialogInterface:DialogInterface,i:Int->dialogInterface.dismiss()
            }
        alertDialogBuilder.create().show()
    }
}
