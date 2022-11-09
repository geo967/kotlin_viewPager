package com.example.viewpager_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import java.lang.Math.abs

class MainActivity : AppCompatActivity() {

    private lateinit var itemList:ArrayList<SliderItem>
    private lateinit var viewPagerAdapter: ViewPagerAdapter
    lateinit var slideHandler: Handler
    lateinit var sliderRun:Runnable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sliderItems()
        itemSliderView()
    }

    private fun sliderItems() {
        itemList= ArrayList()
        val viewPager=findViewById<ViewPager2>(R.id.view_Pager_id)
        viewPagerAdapter= ViewPagerAdapter(viewPager,itemList)
        viewPager.adapter=viewPagerAdapter

   /*     viewPager.clipToPadding=false
        viewPager.clipChildren=false
        viewPager.offscreenPageLimit=3
        viewPager.getChildAt(0).overScrollMode=RecyclerView.OVER_SCROLL_NEVER
        val composPageTarn=CompositePageTransformer()
        composPageTarn.addTransformer(MarginPageTransformer(40))
        composPageTarn.addTransformer { page, position ->
            val r:Float=1- kotlin.math.abs(position)
            page.scaleY=0.85f+r*0.15f
        }
        viewPager.setPageTransformer(composPageTarn)
        slideHandler= Handler()
        sliderRun= Runnable { viewPager.currentItem=viewPager.currentItem+1 }
        viewPager.registerOnPageChangeCallback(
            object:ViewPager2.OnPageChangeCallback(){
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    slideHandler.removeCallbacks(sliderRun)
                    slideHandler.postDelayed(sliderRun,1000)
                }
            })*/

    }

   /* override fun onPause() {
        super.onPause()
        slideHandler.removeCallbacks(sliderRun)
    }

    override fun onResume() {
        super.onResume()
        slideHandler.postDelayed(sliderRun,2000)
    }*/


    private fun itemSliderView() {
        itemList.add(SliderItem(R.drawable.movie1))
        itemList.add(SliderItem(R.drawable.movie2))
        itemList.add(SliderItem(R.drawable.movie3))
        itemList.add(SliderItem(R.drawable.movie4))
        itemList.add(SliderItem(R.drawable.movie5))
        itemList.add(SliderItem(R.drawable.movie6))
        itemList.add(SliderItem(R.drawable.movie7))
        itemList.add(SliderItem(R.drawable.movie8))
    }
}