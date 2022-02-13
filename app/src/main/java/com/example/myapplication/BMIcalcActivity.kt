package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bmicalc.*
import java.lang.Math.pow

class BMIcalcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmicalc)

        btnBMI.setOnClickListener{
            val height = etFirstNumber.text.toString().toDouble()
            val weight = etSecondNumber.text.toString().toInt()
            val result = weight/(pow((height/100), 2.0))
            tvResult.text = result.toString()
        }

    }
}