package com.example.mvvmexample.ui.login

import androidx.databinding.DataBindingUtil
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvvmexample.R
import com.example.mvvmexample.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {
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