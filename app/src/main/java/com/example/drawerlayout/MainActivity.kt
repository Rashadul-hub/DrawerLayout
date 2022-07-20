package com.example.drawerlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private var openDrawerView : View? = null
    private var drawerLayout : DrawerLayout? = null
    private var navView : NavigationView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        openDrawerView = findViewById(R.id.openDrawer)
        drawerLayout = findViewById(R.id.drawerLayout)
        navView = findViewById(R.id.navView)

        openDrawerView?.setOnClickListener {

            drawerLayout?.openDrawer(Gravity.LEFT)
        }

        navView?.setNavigationItemSelectedListener {
            if (it?.itemId == R.id.home)
            {
                Toast.makeText(this, " Home Clicked", Toast.LENGTH_LONG).show()
                true
            }
            else if (it?.itemId == R.id.profile)
            {
                Toast.makeText(this, " Profile Clicked", Toast.LENGTH_LONG).show()
                true
            }
            else if (it?.itemId == R.id.more)
            {
                Toast.makeText(this, " More Clicked", Toast.LENGTH_LONG).show()
                true
            }
            else
            {
                true
            }

        }

    }
}