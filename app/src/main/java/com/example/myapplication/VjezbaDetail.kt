package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_vjezba_detail.*
import kotlinx.android.synthetic.main.layout_list_item.*
import kotlinx.android.synthetic.main.layout_list_item.tv_name

class VjezbaDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_vjezba_detail)

        val name : String = intent.getStringArrayExtra("name").toString()
        tv_name.text = name.toString()

        val details = intent.getStringArrayExtra("details")
        tv_details.text = details.toString()

        when (name) {

            "Pull-up" -> {Glide
                .with(this)
                .load(R.drawable.pullup2)
                .into(iv_image)}
            "Deadlif" -> {
                Glide
                    .with(this)
                    .load(R.drawable.pullup2)
                    .into(iv_image)}
            }

        }
    }






