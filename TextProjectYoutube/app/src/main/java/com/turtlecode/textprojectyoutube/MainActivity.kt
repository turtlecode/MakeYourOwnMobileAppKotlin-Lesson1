package com.turtlecode.textprojectyoutube

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var name = ""
    var age : Int? = null
    var job = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun create_button (view: View) {
        name = name_text.text.toString()
        age  = age_text.text.toString().toIntOrNull()
        job  = job_text.text.toString()

        if (age == null) {
            information_text.text = "Wrong Input(age)"
        } else {
            information_text.text = "Name:${name}\nAge:${age}\nJob:${job}"
        }
    }
}