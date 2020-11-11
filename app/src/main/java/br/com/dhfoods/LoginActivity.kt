package br.com.dhfoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.body_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        btnLogin.setOnClickListener() {
            callFeed()
        }

        btnRegister.setOnClickListener {
            callRegister()
        }

    }

    fun callFeed(){
        var intent = Intent(this, FeedActivity::class.java)
        startActivity(intent)
    }

    fun callRegister(){
        var intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }


}