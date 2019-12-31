package com.buzzingsilently.androidlifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class AActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        Log.e("Activity State", "onCreate A")
    }

    override fun recreate() {
        super.recreate()
        Log.e("Activity State", "recreate A")
    }

    override fun onStart() {
        super.onStart()
        Log.e("Activity State", "onStart A")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("Activity State", "onRestart A")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Activity State", "onResume A")
    }

    override fun onPause() {
        Log.e("Activity State", "onPause A")
        super.onPause()
    }

    override fun onStop() {
        Log.e("Activity State", "onStop A")
        super.onStop()
    }

    override fun onDestroy() {
        Log.e("Activity State", "onDestroy A")
        super.onDestroy()
    }

    override fun onBackPressed() {
        Log.e("Activity State", "onBackPressed A")
        super.onBackPressed()
    }

    fun onClick(view: View) {
        if (view.id == R.id.tvGoToB) {
            Log.e("Activity State", "onClick A")
            startActivity(Intent(this, BActivity::class.java))
        }
    }
}
