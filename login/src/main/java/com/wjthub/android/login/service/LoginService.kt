package com.wjthub.android.login.service

import com.wjthub.android.login.domain.Login

interface LoginService {
    fun login(login: Login)
}