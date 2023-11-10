package com.hs.islamic.oneactivitytoanotherkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.hs.islamic.oneactivitytoanotherkotlin.databinding.ActivityListViewBinding

class ListViewActivity : AppCompatActivity() {

  private lateinit var binding: ActivityListViewBinding
 val suggestion= arrayOf(
     "Saudi Arabia",
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
     "United Arab Emirates"
 )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityListViewBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val arrayAdapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_list_item_1,
            suggestion
        )

        binding.listview.adapter = arrayAdapter

        binding.listview.setOnItemClickListener { parent, view, position, id ->
            val selectedItem = parent.getItemAtPosition(position) as String
            Toast.makeText(this, "You selected: $selectedItem", Toast.LENGTH_SHORT).show()
        }


    }
}