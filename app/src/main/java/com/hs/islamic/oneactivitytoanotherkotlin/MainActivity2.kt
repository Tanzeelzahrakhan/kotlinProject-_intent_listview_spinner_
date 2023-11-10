package com.hs.islamic.oneactivitytoanotherkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hs.islamic.oneactivitytoanotherkotlin.databinding.ActivityMain2Binding
import com.hs.islamic.oneactivitytoanotherkotlin.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        val bundle:Bundle?=intent.extras
        val TvFirst=bundle?.get("key")
        val TvSec=bundle?.get("key2")

        binding.tvOne.text=TvFirst.toString()
        binding.tvTwo.text=TvSec.toString()
    }
}