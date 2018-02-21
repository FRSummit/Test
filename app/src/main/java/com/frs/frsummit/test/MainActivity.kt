package com.frs.frsummit.test

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Burger", "Pizza", "Chicken Toast", "Steak", "Mutton", "Fish kary")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener(){
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedFoodName.text = foodList[randomFood]
//            comment
        }
    }
}
