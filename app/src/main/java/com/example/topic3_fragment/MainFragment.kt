package com.example.topic3_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainFragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.container2, FragmentDua())
            commit()
        }

        btn1.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.container2, FragmentSatu())
                commit()
            }
        }

        btn2.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.container2, FragmentDua())
                commit()
            }
        }
    }
}