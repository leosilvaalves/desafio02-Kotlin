package br.com.dhfoods

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_prato.*

class PratoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prato)


        //Adicionando o toolbar
        setSupportActionBar(findViewById(R.id.toolbarBack2))

        tx_logoPrato.setText("Salada com molho Gengibre")
        descricao_prato.setText("Descrição Descrição Descrição Descrição Descrição Descrição" +
                "Descrição Descrição Descrição Descrição Descrição Descrição Descrição Descrição Descrição" +
                " Descrição Descrição Descrição Descrição Descrição Descrição Descrição Descrição Descrição")

    }


}