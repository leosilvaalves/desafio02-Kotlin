package br.com.dhfoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_restaurant.*
import kotlinx.android.synthetic.main.item_prato.*
import kotlinx.android.synthetic.main.item_restaurante.*

class RestaurantActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant)

        var restaurante = intent.getSerializableExtra("key") as? Restaurante
        //Adicionando o toolbar
        setSupportActionBar(findViewById(R.id.toolbarBack))


        tx_logoRestaurante.setText(restaurante!!.nome)
        img_logoRestaurante.setBackgroundResource(restaurante!!.imagem)

        card_prato.setOnClickListener {
            callPrato()
        }

    }

    fun callPrato(){
    var intent = Intent(this, PratoActivity::class.java)
        intent.putExtra("key",intent.getSerializableExtra("key"))
        startActivity(intent)
    }
}