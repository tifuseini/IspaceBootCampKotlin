package com.ispace.bootcampispace.allLearners

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ispace.bootcampispace.R

class AllLearnerAdapter (
    private val context: Context,
    private val learnerList:List<AllLearnersDataModel>,
    private val handleLearnClick : HandleLearnerClick
        ): RecyclerView.Adapter<AllLearnerAdapter.AllLearnersViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AllLearnerAdapter.AllLearnersViewHolder {
        val roorView = LayoutInflater.from(context).inflate(R.layout)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: AllLearnerAdapter.AllLearnersViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}