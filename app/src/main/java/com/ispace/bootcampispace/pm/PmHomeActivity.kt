package com.ispace.bootcampispace.pm

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ispace.bootcampispace.R
import com.ispace.bootcampispace.allLearners.AllLearnersAdapter
import com.ispace.bootcampispace.allLearners.AllLearnersDataModel
import com.ispace.bootcampispace.allLearners.Constants
import com.ispace.bootcampispace.allLearners.LearnerProfileActivity

class PmHomeActivity  : AppCompatActivity(){

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pm_home)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle("PM Learners")

        recyclerView = findViewById(R.id.recyclerViewpm)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val learnersList = ArrayList<AllLearnersDataModel>()

        learnersList.add(
            AllLearnersDataModel(
                "Claudia","Mintogo", "claudiamintogo@gmail.com","Female",
                "Student","0269384159", "Awoshie" ,Constants.CLAUDIA
            )
        )
        learnersList.add(
            AllLearnersDataModel(
                "Albert","Osei","oseialbert072@gmail.com","Male",
                "Software developer","0542291420","Labadi", Constants.ALBERT
            )
        )
        learnersList.add(
            AllLearnersDataModel(
                "Tahiru","Fuseini","tifuseini@st.ug.edu.gh","Male",
                "Software Developer","0504711867","Accra",Constants.TAHIRU
            )
        )

        val adapta = AllLearnersAdapter(this,learnersList,object : AllLearnersAdapter.HandleLearnerClick{
            override fun onLearnerClick(position: Int) {
                val allLearner = learnersList[position]
                val fName: String = allLearner.FirstName
                val lName: String = allLearner.LastName
                val email: String = allLearner.email
                val gender: String = allLearner.gender
                val profession :String = allLearner.profession
                val learnerImag : Int = allLearner.profileImg
                val phoneNumb: String = allLearner.phoneNumber


                val intent = Intent(this@PmHomeActivity, LearnerProfileActivity::class.java)
                intent.putExtra("fname",fName)
                intent.putExtra("lname",lName)
                intent.putExtra("email",email)
                intent.putExtra("gender",gender)
                intent.putExtra("phone",phoneNumb)
                intent.putExtra("profession",profession)
                intent.putExtra("learnerImg",learnerImag)
                intent.putExtra("PM","PM")
                startActivity(intent)
            }

        })

        recyclerView.adapter = adapta
    }
}