package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textTimer = findViewById<TextView>(R.id.textTimer)
        var btnAdd = findViewById<Button>(R.id.button_add)
        var btnReset = findViewById<Button>(R.id.button_reset)

        val viewModel = ViewModelProvider(this).get(ActivityViewModel::class.java)

        textTimer.text = viewModel.number.toString()

        btnAdd.setOnClickListener {
            viewModel.addNumber()
            textTimer.text = viewModel.number.toString()
        }

        btnReset.setOnClickListener {
            viewModel.resetNumber()
            textTimer.text = viewModel.number.toString()
        }

    }
}