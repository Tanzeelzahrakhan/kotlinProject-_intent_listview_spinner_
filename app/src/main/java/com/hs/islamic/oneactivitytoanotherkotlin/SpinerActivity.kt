package com.hs.islamic.oneactivitytoanotherkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import android.widget.Toast.makeText
import com.hs.islamic.oneactivitytoanotherkotlin.databinding.ActivitySpinerBinding

class SpinerActivity : AppCompatActivity() {
    private lateinit var binding :ActivitySpinerBinding

    val item= arrayOf( "Saudi Arabia",
        "Pakistan",
        "Indonesia",
        "Iran",
        "Turkey",
        "Egypt",
        "Malaysia",
        "Bangladesh",
        "Iraq",
        "Nigeria",
        "Afghanistan",
        "Algeria",
        "Morocco",
        "Jordan",
        "United Arab Emirates")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySpinerBinding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.spinner.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,item)



        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                binding.tvResult.text="Please Select Your Country"

                binding.tvResult.text=item.get(position.toInt())

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }







    }
}