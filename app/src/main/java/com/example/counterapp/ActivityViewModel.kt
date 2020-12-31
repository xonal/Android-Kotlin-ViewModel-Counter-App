package com.example.counterapp

import androidx.lifecycle.ViewModel

class ActivityViewModel : ViewModel() {
    var number = 0;

    fun addNumber(){
        number++
    }

    fun resetNumber(){
        number = 0
    }
}