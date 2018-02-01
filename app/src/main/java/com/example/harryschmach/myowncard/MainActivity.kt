package com.example.harryschmach.myowncard

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_bday -> {
                greeting.setText(R.string.title_bday)
                card_image.setImageResource(R.drawable.birthdays)
                bottom_text.setText(R.string.bottom_bday)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_congrats -> {
                greeting.setText(R.string.title_congrats)
                card_image.setImageResource(R.drawable.confetti_girl)
                bottom_text.setText(R.string.bottom_congrats)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_GwG2018 -> {
                greeting.setText(R.string.title_just_cuz)
                card_image.setImageResource(R.drawable.GrowWithGoogleDeveloperChallengeScholarship)
                bottom_text.setText(R.string.bottom_just_cuz)
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
