package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import kotlinx.android.synthetic.main.activity_main.checkBox
import kotlinx.android.synthetic.main.activity_main.checkBox2


class MainActivity : AppCompatActivity() {
    lateinit var checkbox1:CheckBox;
    lateinit var checkbox2:CheckBox;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        checkbox1 = findViewById<CheckBox>(R.id.checkBox)
        checkbox2= findViewById<CheckBox>(R.id.checkBox2)
        setContentView(R.layout.activity_main)
      checkbox1.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
            }
        }
        checkBox2.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                val intent = Intent(this, MainActivity3::class.java)
                startActivity(intent)
            }
        }

    }
}
