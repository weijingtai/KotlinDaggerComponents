package com.wjthub.android.login.repository

import android.util.Log
import com.wjthub.android.login.domain.Login
import com.wjthub.android.login.service.LoginService
import javax.inject.Inject


class LoginRepository @Inject constructor(val loginService: LoginService){

    fun login(login: Login){
        Log.i("LoginRepository-login","${login}")
    }

}

