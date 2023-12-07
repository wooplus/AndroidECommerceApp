package com.example.nov30

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nov30.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding : ActivityThirdBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        val view = binding.root
        val extras = intent.extras ?: return

        val item1 = extras.getString("item1")
        val item2 = extras.getString("item2")
        val item3 = extras.getString("item3")
        val item1CheckoutPrice = extras.getString("item1Price")
        val item2CheckoutPrice = extras.getString("item2Price")
        val item3CheckoutPrice = extras.getString("item3Price")

        if(!item1.equals("")) {
            binding.item1Text.text = item1
            binding.item1CheckoutPrice.text =item1CheckoutPrice
        }

        if(!item2.equals("")) {
            binding.item2Text.text  = item2
            binding.item2CheckoutPrice.text =item2CheckoutPrice

        }

        if(!item3.equals("")) {
            binding.item3Text.text = item3
            binding.item3CheckoutPrice.text =item3CheckoutPrice

        }

        binding.paymentBtn.setOnClickListener{
            val i = Intent(this,FourthActivity::class.java)
//            i.putExtra("myString", "This is a message for ActivityB")
//            i.putExtra("myInt", 10)
            startActivity(i)
        }


        setContentView(view)

    }
}