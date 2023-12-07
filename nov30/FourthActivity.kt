package com.example.nov30

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nov30.databinding.ActivityFourthBinding

class FourthActivity : AppCompatActivity() {

    private lateinit var binding : ActivityFourthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.homePageBtn.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }

    }
}
