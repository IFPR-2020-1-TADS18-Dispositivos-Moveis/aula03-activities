package br.edu.ifpr.stiehl.aula03_activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btLogin.setOnClickListener {
            val username = edUsername.text.toString()
            val password = edPassword.text.toString()
            val valid = validLogin(username, password)

            if (valid) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
            }
        }
    }

//    fun validLogin(username: String, password: String): Boolean {
//        return username == "student" && password == "123"
//    }

    fun validLogin(username: String, password: String) =
        username == "student" && password == "123"
}
