package br.com.dhfoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT: Long = 3000 // 1 sec
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            // Inicia a nova activity

            startActivity(Intent(this, LoginActivity::class.java))

            // fecha a activity
            finish()
        }, SPLASH_TIME_OUT)
    }
}
