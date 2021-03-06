package com.example.mvvmexample.ui.register

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvmexample.data.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class RegisterViewModel: ViewModel() {

    private val TAG = RegisterViewModel::class.simpleName
    private val _progressVisibility = MutableLiveData<Boolean>()
    val progressVisibility: LiveData<Boolean> get() = _progressVisibility

    private val _userData = MutableLiveData<User>()
    val userData: LiveData<User> get() = _userData

    fun getUserData(): MutableLiveData<User> = userData as MutableLiveData<User>

    fun registerUser(name: String, lastName: String, pass: String, age: String, phone: String) {
        _progressVisibility.value = true
        viewModelScope.launch(Dispatchers.IO) {
            //Thread.sleep(2000)
            Log.i(TAG, name + lastName + pass + age + phone)
            _progressVisibility.postValue(false)
        }
    }
}