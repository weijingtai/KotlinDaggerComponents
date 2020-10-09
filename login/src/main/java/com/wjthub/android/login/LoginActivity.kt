package com.wjthub.android.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.alibaba.android.arouter.facade.annotation.Route
import com.wjthub.android.baselibrary.BaseApplication
import com.wjthub.android.baselibrary.router.ModuleRouter
import com.wjthub.android.login.di.DaggerLoginComponent


@Route(path = ModuleRouter.LOGIN_MODULE)
class LoginActivity : AppCompatActivity() {
    companion object{
        const val PATH:String= """${ModuleRouter.LOGIN_MODULE}/login"""
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        inject()
        initNavigation()

    }
    private fun initNavigation(){
        val navController = findNavController(R.id.loginActivity_container_fragment)
        val appBarConfiguration = AppBarConfiguration(setOf(
            R.id.navigation_login_home,
            R.id.navigation_login_register
        ))
        setupActionBarWithNavController(navController,appBarConfiguration)
    }
    fun inject(){
        DaggerLoginComponent
            .builder()
            .baseComponent(BaseApplication.baseComponent)
            .build()
            .inject(this)
    }
}
