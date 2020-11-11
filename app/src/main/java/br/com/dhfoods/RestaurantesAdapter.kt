package br.com.dhfoods

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_restaurante.view.*

class RestaurantesAdapter(private val listRestaurantes: ArrayList<Restaurante>, val listener: OnRestauranteClickListener)
    : RecyclerView.Adapter<RestaurantesAdapter.RestaurantesViewHolder>(){

    //inflando a recyclerview com o item
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantesViewHolder {
        var itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_restaurante, parent, false)
        return RestaurantesViewHolder(itemView)
    }

    //passando dados para cada item
    override fun onBindViewHolder(holder: RestaurantesViewHolder, position: Int) {
        var r = listRestaurantes[position]




        //pega o tvNome do RestaurantesViewHolder
        holder.tvNome.text = r.nome
        holder.tvEndereco.text = r.endereco
        holder.tvHorario.text = r.horarioFechamento
        holder.imgRest.setImageResource(r.imagem)
    }

    //pegando tamanho da lista
    override fun getItemCount() = listRestaurantes.size


    //interface que traz comportamento de click e vai ser sobrescrita na activity
    interface OnRestauranteClickListener {
        fun restauranteClick(position: Int)

    }

    inner class RestaurantesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

        //para cada componente dinamico do item fazemos:
        val tvNome: TextView = itemView.findViewById(R.id.tv_nomeRestaurante)
        val tvEndereco: TextView = itemView.findViewById(R.id.tv_endereco)
        val tvHorario: TextView = itemView.findViewById(R.id.tv_horario)
        val imgRest: ImageView = itemView.findViewById(R.id.img_restaurante)


        init{
            itemView.setOnClickListener(this)
        }


        //passa a position para a interface OnGastoClick Listener
        override fun onClick(v: View?) {
            val position = adapterPosition
            if (RecyclerView.NO_POSITION != position)
                listener.restauranteClick(position)

        }
    }
}