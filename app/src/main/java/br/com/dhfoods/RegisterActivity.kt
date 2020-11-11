package br.com.dhfoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.body_cadastro.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        //Adicionando o toolbar
        setSupportActionBar(findViewById(R.id.toolbarBack))

        btnConfRegister.setOnClickListener {
            callFeed()
        }
    }


    fun callFeed(){
        var intent = Intent(this, FeedActivity::class.java)
        startActivity(intent)
    }



}