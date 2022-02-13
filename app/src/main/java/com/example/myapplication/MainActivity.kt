package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnBack = findViewById<Button>(R.id.btnBack)
        val btnPec = findViewById<Button>(R.id.btnPec)
        val btnArms = findViewById<Button>(R.id.btnArms)
        val btnLegs = findViewById<Button>(R.id.btnLegs)
        val btnFullbody = findViewById<Button>(R.id.btnFullbody)
        val btnBMIcalc = findViewById<Button>(R.id.btnBMIcalc)

        btnBack.setOnClickListener{
            Intent(this, BackActivity::class.java).also {
                startActivity(it)
            }
        }

        btnPec.setOnClickListener{
            Intent(this, PecActivity::class.java).also {
                startActivity(it)
            }
        }

        btnLegs.setOnClickListener{
            Intent(this, LegsActivity::class.java).also {
                startActivity(it)
            }
        }

        btnArms.setOnClickListener{
            Intent(this, ArmsActivity::class.java).also {
                startActivity(it)
            }
        }

        btnFullbody.setOnClickListener{
            Intent(this, FullbodyActivity::class.java).also {
                startActivity(it)
            }
        }

        btnBMIcalc.setOnClickListener{
            Intent(this, BMIcalcActivity::class.java).also {
                startActivity(it)
            }
        }


    }
}