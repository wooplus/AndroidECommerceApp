package com.example.nov30

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nov30.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySecondBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        val extras = intent.extras ?: return
        val j = Intent(this, ThirdActivity::class.java)

//        val myString = extras.getString("myString")
//        val myInt = extras.getInt("myInt")

//        binding.textView2.text = myString + "My age is " + myInt

        binding.checkoutBtn.setOnClickListener {
            j.putExtra("myItem", "this is item testing")
            startActivity(j)
        }

//        binding.button.setOnClickListener {
//            val i = Intent(this,SecondActivity::class.java)
//
//            i.putExtra("myString", "This is a message for ActivityB")
//            i.putExtra("myInt", 10)
//            startActivity(i)

        setContentView(view)

        binding.itemBtn1.setOnClickListener {
            binding.itemBtn1.text = "Added"
            j.putExtra("item1", binding.item1Title.text)
            j.putExtra("item1Price", binding.item1Price.text)

        }

        binding.itemBtn2.setOnClickListener {
            binding.itemBtn2.text = "Added"
            j.putExtra("item2", binding.item2Title.text)
            j.putExtra("item2Price", binding.item2Price.text)

        }

        binding.itemBtn3.setOnClickListener {
            binding.itemBtn3.text = "Added"
            j.putExtra("item3", binding.item3Title.text)
            j.putExtra("item3Price", binding.item3Price.text)

        }

    }
}