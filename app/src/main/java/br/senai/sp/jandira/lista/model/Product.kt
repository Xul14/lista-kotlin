package br.senai.sp.jandira.lista.model

import androidx.compose.ui.graphics.painter.Painter

data class Product(
    var id: Int = 0,
    var name: String = "",
    var description: String = "",
    var image: Painter? = null,
    var price: Double = 0.0
){

}