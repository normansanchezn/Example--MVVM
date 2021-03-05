package com.example.mvvmexample.ui.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.example.mvvmexample.R
import com.example.mvvmexample.databinding.ActivityMainBinding
import com.example.mvvmexample.ui.register.RegisterActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {

    private lateinit var viewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val databinding: ActivityMainBinding = DataBindingUtil.setContentView(this, getLayout())
        configView(databinding)

        viewModel = ViewModelProvider(this).get()

        // Con esto ya se actualizan los datos con databinding
        databinding.viewModel = viewModel
        databinding.lifecycleOwner = this
    }

    private fun configView(databinding: ActivityMainBinding) {
        with(databinding) {
            btnLogin.setOnClickListener {
                viewModel!!.onButtonClicked(etUserName.text.toString(), etPassword.text.toString())
            }

            tvRegister.setOnClickListener {
                val mIntent = Intent(applicationContext, RegisterActivity::class.java)
                startActivity(mIntent)
            }
        }
    }

    private fun getLayout(): Int = R.layout.activity_main
}