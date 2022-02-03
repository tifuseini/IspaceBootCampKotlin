package com.ispace.bootcampispace.start

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ispace.bootcampispace.R

class IntroSlideAdapter(
    private val introSlide: List<IntroSlide>
) :RecyclerView.Adapter<IntroSlideAdapter.IntroSlideViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): IntroSlideViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: IntroSlideViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return introSlide.size
    }


    inner class IntroSlideViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val textTitle = view.findViewById<TextView>(R.id.textTitle)
        private val textDescription = view.findViewById<TextView>(R.id.textDescription)


}