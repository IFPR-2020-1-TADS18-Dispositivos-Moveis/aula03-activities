package br.edu.ifpr.stiehl.aula03_activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        val info = intent.extras?.getString("info")
        txtInfo.text = "Info: ${info}"

        Log.i("TADS", "OtherActivity.onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i("TADS", "OtherActivity.onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("TADS", "OtherActivity.onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("TADS", "OtherActivity.onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("TADS", "OtherActivity.onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("TADS", "OtherActivity.onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("TADS", "OtherActivity.onDestroy")
    }
}
