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
        val stock = "Stok Tersedia : "+ data?.getInt("stock").toString()
        val desc = "Deskripsi :\n\n"+ data!!.getString("desc")

        binding.imageDetail.setImageResource(data.getInt("image"))
        binding.namaDetail.text = data.getString("name")
        binding.hargaDetail.text = data.getString("price")
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
                val name = data!!.getString("name")
                val price = data.getString("price")
                val destination = "https://api.whatsapp.com/send?phone=$phone&text=Halo, saya tertarik " +
                        "dengan produk $name dengan harga $price. Apakah masih tersedia?"
                setData(Uri.parse(destination))
            }
            startActivity(toWA)
        }
    }
}