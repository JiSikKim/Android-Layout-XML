package com.example.constraintlayout_study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ib_bookmark.setOnClickListener {
            Toast.makeText(this, "pressed bookmark button", Toast.LENGTH_SHORT).show()
        }
    }
}
