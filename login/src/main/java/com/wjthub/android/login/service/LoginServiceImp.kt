package com.wjthub.android.login.service

import android.util.Log
import com.wjthub.android.login.domain.Login
import javax.inject.Inject

class LoginServiceImp @Inject constructor():LoginService {
    override fun login(login: Login) {
       Log.i("LoginServiceImp-login","Login Info == ${login}")
    }
}