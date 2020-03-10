package br.edu.ifpr.stiehl.aula03_activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private lateinit var info: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState != null) {
            this.info = savedInstanceState.getString("info", "")
        } else {
            this.info = ""
        }
        txtRestore.text = this.info

        Log.i("TADS", "MainActivity.onCreate")

        btOpen.setOnClickListener {
            val info = edInfo.text.toString()

            val bundle = Bundle()
            bundle.putString("info", info)

            val intent = Intent(this, OtherActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

        btSave.setOnClickListener {
            val info = edInfo.text.toString()
            this.info = info
        }

        btRestore.setOnClickListener {
            txtRestore.text = this.info
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("TADS", "MainActivity.onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("TADS", "MainActivity.onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("TADS", "MainActivity.onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("TADS", "MainActivity.onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("TADS", "MainActivity.onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("TADS", "MainActivity.onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i("TADS", "MainActivity.onSaveInstanceState")

        outState.putString("info", this.info)
    }

}
