package com.cowok.hijrah.chapter4topic3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cowok.hijrah.chapter4topic3.databinding.ItemProductBinding

class ProductAdapter(var listProduct: ArrayList<Product>): RecyclerView.Adapter<ProductAdapter.ViewHolder>() {
    class ViewHolder(var binding: ItemProductBinding): RecyclerView.ViewHolder(binding.root) {
        fun bindProduct(itemProduct: Product){
            binding.product = itemProduct
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindProduct(listProduct[position])
    }

    override fun getItemCount(): Int {
        return listProduct.size
    }

    fun setDataProduct(itemData: ArrayList<Product>){
        this.listProduct = itemData
    }
}