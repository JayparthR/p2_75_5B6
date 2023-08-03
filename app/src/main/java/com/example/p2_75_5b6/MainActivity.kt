package com.example.p2_75_5b6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayMessage("onCreate")

    }

    override fun onStart() {
        super.onStart()
        displayMessage("Onstart")

    }

    override fun onResume() {
        super.onResume()
        displayMessage("onResume")
    }

    override fun onPause() {
        super.onPause()
        displayMessage("onPause")
    }

    override fun onStop() {
        super.onStop()
        displayMessage("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        displayMessage("onDestroy")
    }

    fun displayMessage(msg:String){
        Toast.makeText(this,"This is a $msg",Toast.LENGTH_LONG).show()
        Snackbar.make(findViewById(R.id.mycoordinatorlayout)
        R.String.email_sent,Snackbar.LENGTH_SHORT).Show
        Log.i(TAG,"$msg" + "is called")
    }

}