package com.example.nov30

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nov30.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener {
            val i = Intent(this,SecondActivity::class.java)

            i.putExtra("myString", "This is a message for ActivityB")
            i.putExtra("myInt", 10)
            startActivity(i)


//            val intent = Intent(Intent.ACTION_VIEW,
//                Uri.parse("http://www.laguardia.edu"))
//            startActivity(intent)
        }

    }
}
