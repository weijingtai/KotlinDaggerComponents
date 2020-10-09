package com.wjthub.android.login.viewmodel

import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.Navigation
import com.wjthub.android.login.R
import com.wjthub.android.login.domain.Login
import com.wjthub.android.login.repository.LoginRepository
import javax.inject.Inject

class HomeViewModel @Inject constructor(private val loginRepository: LoginRepository) : ViewModel() {


    var email:MutableLiveData<String> = MutableLiveData<String>("")
    var password:MutableLiveData<String> = MutableLiveData<String>("")


    fun toRegister(view:View){
        Toast.makeText(view.context,"Jump To Register",Toast.LENGTH_SHORT).show()
        Navigation.findNavController(view).navigate(R.id.action_navigation_login_home_to_register)
    }
    fun login(view:View){
        Log.i("LoginRegisterHomeViewModel-login","User Request Login, ${email.value},${password.value} .")
        loginRepository.login(Login("123","123"))
        Toast.makeText(view.context,"Start Login Request",Toast.LENGTH_SHORT).show()
    }

}