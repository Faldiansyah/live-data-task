package com.cowok.hijrah.chapter4topic3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.cowok.hijrah.chapter4topic3.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail)

        val data = intent.extras
        val price = "Rp. "+ data?.getInt("price").toString()
        val stock = "Stok Tersedia : "+ data?.getInt("stock").toString()
        val desc = "Deskripsi :\n\n"+ data!!.getString("desc")

        binding.imageDetail.setImageResource(data.getInt("image"))
        binding.namaDetail.text = data.getString("name")
        binding.hargaDetail.text = price
        binding.stokDetail.text = stock
        binding.deskripsiDetail.text = desc

        enterWhatsApp()
    }

    fun enterWhatsApp(){
        binding.buttonBeli.setOnClickListener {
            val toWA = Intent().apply {
                action = Intent.ACTION_VIEW
                val phone = "+6281342687092"
                val data = intent.extras
                val produk = data!!.getString("name")
                val harga = data.getInt("price")
                val destination = "https://api.whatsapp.com/send?phone=$phone&text=Halo, saya tertarik " +
                        "dengan produk $produk dengan harga Rp. ${harga}. Apakah masih tersedia?"
                setData(Uri.parse(destination))
            }
            startActivity(toWA)
        }
    }
}