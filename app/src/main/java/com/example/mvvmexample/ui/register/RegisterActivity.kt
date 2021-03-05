package com.example.mvvmexample.ui.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.mvvmexample.R
import com.example.mvvmexample.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val databinding: ActivityRegisterBinding = DataBindingUtil.setContentView(this, getLayout())
        configView(databinding)
    }

    private fun configView(databinding: ActivityRegisterBinding) {
        with(databinding) {

        }
    }

    private fun getLayout(): Int = R.layout.activity_register
}