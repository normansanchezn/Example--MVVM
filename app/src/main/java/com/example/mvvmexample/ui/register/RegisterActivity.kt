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

class RegisterActivity : AppCompatActivity() {

    private lateinit var registerViewModel: RegisterViewModel
    private lateinit var userData: MutableLiveData<User>

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
                userData = registerViewModel.getUserData()

                registerViewModel.registerUser(
                    userData.value!!.name,
                    userData.value!!.lastName,
                    userData.value!!.password,
                    userData.value!!.age,
                    userData.value!!.phone
                    )
            }
        }
    }

    private fun getLayout(): Int = R.layout.activity_register
}