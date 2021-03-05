package com.example.mvvmexample

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.mvvmexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val databinding: ActivityMainBinding = DataBindingUtil.setContentView(this, getLayout())
        configView(databinding)
    }

    private fun configView(databinding: ActivityMainBinding) {
        with(databinding) {
            btnLogin.setOnClickListener {
                
            }
        }
    }

    private fun getLayout(): Int = R.layout.activity_main
}