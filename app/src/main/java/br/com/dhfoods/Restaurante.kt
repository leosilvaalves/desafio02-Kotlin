package br.com.dhfoods

import java.io.Serializable

class Restaurante (val imagem: Int, val nome:String, val endereco:String, val horarioFechamento:String, val pratosPrincipais :MutableList<Prato>)
    :Serializable {
}