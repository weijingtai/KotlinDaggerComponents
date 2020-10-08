package com.wjthub.android.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wjthub.android.baselibrary.di.BaseApplication
import com.wjthub.android.login.di.DaggerLoginComponent

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    fun inject(){
//        val app = (application as BaseApplication)
        DaggerLoginComponent
            .builder()
            .baseComponent(BaseApplication.baseComponent)
            .build()
            .inject(this)
    }
}
