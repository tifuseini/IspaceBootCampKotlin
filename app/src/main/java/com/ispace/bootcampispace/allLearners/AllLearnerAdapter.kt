package com.ispace.bootcampispace.allLearners

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ispace.bootcampispace.R

class AllLearnersAdapter (
    private val context: Context,
    private val learnerList:List<AllLearnersDataModel>,
    private val handleLearnClick : HandleLearnerClick
        ): RecyclerView.Adapter<AllLearnersAdapter.AllLearnersViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AllLearnersAdapter.AllLearnersViewHolder {
        val rootView = LayoutInflater.from(context).inflate(R.layout.learner_row_data,parent,false)
        return AllLearnersViewHolder(rootView)
    }

    override fun getItemCount(): Int {
        return learnerList.size
    }

    override fun onBindViewHolder(holder:AllLearnersViewHolder, position: Int) {
        val dataPosition = learnerList[position]

        holder.first_name.text = dataPosition.FirstName
        holder.learnerClick.setOnClickListener{
            handleLearnClick.onLearnerClick(position)
        }

        Glide
            .with(context)
            .load(dataPosition.profileImg)
            .centerCrop()
            .placeholder(R.drawable.ic_launcher_background)
            .into(holder.imgUrl)
    }

    interface HandleLearnerClick{
        fun onLearnerClick(position: Int)
    }

    class AllLearnersViewHolder(LearnerView:View):RecyclerView.ViewHolder(LearnerView){
        val imgUrl:ImageView = LearnerView.findViewById(R.id.imageView)
        val first_name : TextView = LearnerView.findViewById(R.id.textView)
        val learnerClick:CardView = LearnerView.findViewById(R.id.relativelayoutdesign)
    }
}