package com.example.topic3_fragment.bottomNav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.topic3_fragment.FragmentDua
import com.example.topic3_fragment.R
import kotlinx.android.synthetic.main.activity_gojek.*

class GojekActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gojek)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fcGojek, HomeFragment())
            commit()
        }
        bottomNav.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.menuHome ->{
                    supportFragmentManager.beginTransaction().replace(R.id.fcGojek,HomeFragment()).commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.menuChat ->{
                    supportFragmentManager.beginTransaction().replace(R.id.fcGojek,ChatFragment()).commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.menuPromo ->{
                    supportFragmentManager.beginTransaction().replace(R.id.fcGojek,PromoFragment()).commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.menuProfile ->{
                    supportFragmentManager.beginTransaction().replace(R.id.fcGojek,ProfileFragment()).commit()
                    return@setOnNavigationItemSelectedListener true
                }
            }
            false
        }
    }
}