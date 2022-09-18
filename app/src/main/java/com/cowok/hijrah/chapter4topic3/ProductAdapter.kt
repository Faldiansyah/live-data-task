package com.cowok.hijrah.chapter4topic3

import android.content.Intent
import android.os.Bundle
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
            binding.cardProduct.setOnClickListener(object : View.OnClickListener{
                override fun onClick(view: View?) {
                    var bund = Bundle()
                    bund.putInt("image", itemProduct.imgProduct)
                    bund.putString("name", itemProduct.namaProduct)
                    bund.putInt("price", itemProduct.hargaProduct)
                    bund.putInt("stock", itemProduct.stokProduct)
                    bund.putString("desc", itemProduct.deskripsi)
                    val toDetail = Intent(view!!.context, DetailActivity::class.java)
                    toDetail.putExtras(bund)
                    view.context.startActivity(toDetail)
                }
            })
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