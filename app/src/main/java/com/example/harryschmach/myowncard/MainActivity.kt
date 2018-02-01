package com.example.harryschmach.myowncard

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.view.View.GONE
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_bday -> {
                greeting.setText(R.string.greeting_bday)
                card_image.setImageResource(R.drawable.birthdays)
                bottom_text.setText(R.string.bottom_bday)
                greeting.visibility  = android.view.View.VISIBLE
                bottom_text.visibility = android.view.View.VISIBLE
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_congrats -> {
                greeting.setText(R.string.greeting_congrats)
                card_image.setImageResource(R.drawable.confettigirl)
                bottom_text.setText(R.string.bottom_congrats)
                greeting.visibility  = android.view.View.VISIBLE
                bottom_text.visibility = android.view.View.VISIBLE
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_GwG2018 -> {
                greeting.setText(R.string.title_just_cuz)
                greeting.visibility = GONE
                card_image.setImageResource(R.drawable.growwithgoogledeveloperchallengescholarship)
                bottom_text.visibility = GONE
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
