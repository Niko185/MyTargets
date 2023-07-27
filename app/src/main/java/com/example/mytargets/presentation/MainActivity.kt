package com.example.mytargets.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.mytargets.R

class MainActivity : AppCompatActivity() {
    private lateinit var mainViewModel: MainViewModel

    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]
        mainViewModel.targetList.observe(this){
            Log.d("MyLog", it.toString())
            if(count == 0) {
                count++
                val firstItemFromList = it[0]
                mainViewModel.changeIsActiveState(firstItemFromList)
            }
        }

    }
}