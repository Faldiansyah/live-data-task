package com.cowok.hijrah.chapter4topic3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.cowok.hijrah.chapter4topic3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var vmProduct: ViewModelProduct
    lateinit var adapterProduct: ProductAdapter
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        vmProduct = ViewModelProvider(this).get(ViewModelProduct::class.java)
        adapterProduct = ProductAdapter(ArrayList())

        vmProduct.getProduct()

        vmProduct.product.observe(this, Observer {
            adapterProduct.setDataProduct(it as ArrayList<Product>)
        })

        binding.rvProduct.layoutManager = LinearLayoutManager(
            this, LinearLayoutManager.VERTICAL, false
        )
        binding.rvProduct.adapter = adapterProduct
    }
}