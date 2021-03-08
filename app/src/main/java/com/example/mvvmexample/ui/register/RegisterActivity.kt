package com.example.mvvmexample.ui.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.example.mvvmexample.R
import com.example.mvvmexample.data.User
import com.example.mvvmexample.databinding.ActivityRegisterBinding
import dagger.hilt.android.AndroidEntryPoint

class RegisterActivity : AppCompatActivity() {

    private lateinit var registerViewModel: RegisterViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val databinding: ActivityRegisterBinding = DataBindingUtil.setContentView(this, getLayout())
        configView(databinding)

        registerViewModel = ViewModelProvider(this).get()
        databinding.viewModel = registerViewModel
        databinding.lifecycleOwner = this
    }

    private fun configView(databinding: ActivityRegisterBinding) {
        with(databinding) {
            btnRegister.setOnClickListener {
                registerViewModel.registerUser(
                    etName.text.toString(),
                    etLastName.text.toString(),
                    etPassword.text.toString(),
                    etAge.text.toString(),
                    etPhoneNumber.text.toString())
            }
        }
    }

    private fun getLayout(): Int = R.layout.activity_register
}