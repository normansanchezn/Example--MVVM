package com.example.mvvmexample.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class LoginViewModel: ViewModel() {

    private val _progressVisibility = MutableLiveData<Boolean>()
    val progressVisibility: LiveData<Boolean> get() = _progressVisibility

    private val _message = MutableLiveData<String>()
    val message: LiveData<String> get() = _message

    fun onButtonClicked(user: String, pass: String) {
        _progressVisibility.value = true
        viewModelScope.launch(Dispatchers.IO) {
            Thread.sleep(2000)
            _message.postValue(if (user.isNotEmpty() && pass.isNotEmpty()) "Success" else "Failure")
            _progressVisibility.postValue(false)
        }
    }

}