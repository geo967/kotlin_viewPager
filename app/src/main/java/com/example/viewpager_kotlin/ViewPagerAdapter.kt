package com.example.viewpager_kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2

class ViewPagerAdapter(var viewPager:ViewPager2, private val imageList:ArrayList<SliderItem>)
    :RecyclerView.Adapter<ViewPagerAdapter.MyHolder>(){

    class MyHolder(v: View):RecyclerView.ViewHolder(v) {
        val img=v.findViewById<ImageView>(R.id.image_item_design_id)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val inflater=LayoutInflater.from(parent.context)
        val v=inflater.inflate(R.layout.view_pager_item_design,parent,false)
        return MyHolder(v)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
       val listImage=imageList[position]
        holder.img.setImageResource(listImage.image)
        if(position==imageList.size-2){
            viewPager.post(run)
        }
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    private val run= Runnable {
        imageList.addAll(imageList)
        notifyDataSetChanged()
    }


}