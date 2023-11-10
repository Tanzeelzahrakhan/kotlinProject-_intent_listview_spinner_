package com.hs.islamic.oneactivitytoanotherkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.hs.islamic.oneactivitytoanotherkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener{
            val EtOne=binding.editText1.text.toString()
            val EtTwo=binding.editText2.text.toString()

            Toast.makeText(this,"Name is ="+EtOne+"Email is="+EtTwo,Toast.LENGTH_SHORT).show();
        }
        binding.button2.setOnClickListener {

            val One=binding.editText1.text.toString()
            val Two=binding.editText2.text.toString()

            val intent=Intent(this,MainActivity2::class.java)

            intent.putExtra("key",One)
            intent.putExtra("key2",Two)
            startActivity(intent)

        }
    }
}