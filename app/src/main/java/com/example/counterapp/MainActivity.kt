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

        var textTimer = findViewById<TextView>(R.id.textTimer) //define text
        var btnAdd = findViewById<Button>(R.id.button_add) //define add button
        var btnReset = findViewById<Button>(R.id.button_reset) //define reset button

        val viewModel = ViewModelProvider(this).get(ActivityViewModel::class.java) //initialize viewModel

        textTimer.text = viewModel.number.toString() //set text timer with number variable in viewModel

        btnAdd.setOnClickListener { //action click to add number
            viewModel.addNumber() //call function addNumber() in viewModel
            textTimer.text = viewModel.number.toString() //set text timer with number variable in viewModel
        }

        btnReset.setOnClickListener {
            viewModel.resetNumber() //call function resetNumber() in viewModel
            textTimer.text = viewModel.number.toString() //set text timer with number variable in viewModel
        }

    }
}