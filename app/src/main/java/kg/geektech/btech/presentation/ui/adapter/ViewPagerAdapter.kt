package kg.geektech.btech.presentation.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import kg.geektech.btech.R
import kg.geektech.btech.databinding.ItemPagerBinding

class ViewPagerAdapter: Adapter<ViewPagerAdapter.ImagePhoneViewHolder>() {

    private val array = intArrayOf(R.drawable.model_of_phone, R.drawable.model_of_phone, R.drawable.model_of_phone, R.drawable.model_of_phone, R.drawable.model_of_phone)

    open inner class ImagePhoneViewHolder(private val binding: ItemPagerBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Int) {
            binding.imgModelOfPhone.setImageResource(item)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImagePhoneViewHolder {
        val binding = ItemPagerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ImagePhoneViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ImagePhoneViewHolder, position: Int) {
        holder.bind(array[position])
    }

    override fun getItemCount(): Int {
        return array.size
    }

}