package com.buzzingsilently.androidlifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class BActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        Log.e("Activity State", "onCreate B")
    }

    override fun recreate() {
        super.recreate()
        Log.e("Activity State", "recreate B")
    }

    override fun onStart() {
        super.onStart()
        Log.e("Activity State", "onStart B")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("Activity State", "onRestart B")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Activity State", "onResume B")
    }

    override fun onPause() {
        Log.e("Activity State", "onPause B")
        super.onPause()
    }

    override fun onStop() {
        Log.e("Activity State", "onStop B")
        super.onStop()
    }

    override fun onDestroy() {
        Log.e("Activity State", "onDestroy B")
        super.onDestroy()
    }

    override fun onBackPressed() {
        Log.e("Activity State", "onBackPressed B")
        super.onBackPressed()
    }
}
