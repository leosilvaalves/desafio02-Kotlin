package br.com.dhfoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_feed.*
import java.util.ArrayList

class FeedActivity : AppCompatActivity(),RestaurantesAdapter.OnRestauranteClickListener {

    var listRestaurantes = getAllRestaurantes()

    var adap = RestaurantesAdapter(listRestaurantes, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed)

        //instanciando o adapter
        rvRestaurantes.adapter = adap
        rvRestaurantes.layoutManager = LinearLayoutManager(this)
        rvRestaurantes.setHasFixedSize(true)

    }

    private fun getAllRestaurantes(): ArrayList<Restaurante> {
        var prato1=Prato("Salada com molho Gengibre", "kdlfdlkdsjfdakjfdlfdjfdalkjafdkfdajlds" +
                "sksdajlksdajlkdsajsdALKJSDAldajakjadsljdasldkjdsakjdfsalkdjdksjdfsalkdsjfdalkjdfasldkfsjdlfskjdfs")

        var restaurante1 = Restaurante(R.drawable.image1,"Tony Roma's", "Av. Lavandisca, 717 - Indianópolis, São Paulo",
            "Fecha às 22:00", mutableListOf(prato1,prato1))
        var restaurante2 =  Restaurante(R.drawable.image2,"Aoyama - Moema", "Alameda dos Arapanes, 532 - Moema",
            "Fecha às 00:00", mutableListOf(prato1,prato1))
        var restaurante3 =  Restaurante(R.drawable.image4,"Outback - Moema", "Av. Moaci, 187 - Moema, São Paulo",
            "Fecha às 00:00", mutableListOf(prato1,prato1))
        var restaurante4 =  Restaurante(R.drawable.image3,"Sí Señor!", "Alameda Jauaperi, 626 - Moema",
            "Fecha às 01:00", mutableListOf(prato1,prato1))

        return arrayListOf(restaurante1, restaurante2, restaurante3, restaurante4)
    }

    override fun restauranteClick(position: Int) {
        val r = listRestaurantes[position]

    if (r.nome== "Tony Roma's"){
        callRestaurante(0)
    }
    else if(r.nome== "Aoyama - Moema"){
        callRestaurante(1)
    }
    else if(r.nome== "Outback - Moema"){
        callRestaurante(2)
    }
    else if(r.nome== "Sí Señor!"){
        callRestaurante(3)
    }


    }

    fun callRestaurante(i: Int){
        var intent = Intent(this, RestaurantActivity::class.java)
        intent.putExtra("key",listRestaurantes[i])

        startActivity(intent)
    }
}