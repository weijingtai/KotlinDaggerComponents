package com.wjthub.android.login.viewmodel

import android.view.View
import android.widget.Toast
import androidx.databinding.BaseObservable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.Navigation

class RegisterViewModel : ViewModel() {
    // TODO: Implement the ViewModel

    var username:MutableLiveData<String> = MutableLiveData("")
    var email:MutableLiveData<String> = MutableLiveData("")
    var password:MutableLiveData<String> = MutableLiveData("")
    var repassword:MutableLiveData<String> = MutableLiveData("")

    open fun backToLogin(view:View){
        Toast.makeText(view.context,"Back To Login",Toast.LENGTH_SHORT).show()
        Navigation.findNavController(view).navigateUp()
    }
}