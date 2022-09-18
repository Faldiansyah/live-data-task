package com.cowok.hijrah.chapter4topic3

import java.text.NumberFormat
import java.util.*

data class Product(
    var namaProduct: String,
    var imgProduct: Int,
    var stokProduct: Int,
    var hargaProduct: Int,
    var deskripsi: String
) {
    val formatter = NumberFormat.getCurrencyInstance(Locale("in", "ID"))
    val price = formatter.format(hargaProduct)
}
