package com.wjthub.android.login.di

import com.wjthub.android.baselibrary.di.component.BaseComponent
import com.wjthub.android.baselibrary.di.scope.UserScope
import com.wjthub.android.login.LoginActivity
import dagger.Component


@UserScope
@Component(modules = [LoginModule::class],dependencies = [BaseComponent::class])
interface LoginComponent {
    open fun inject(loginActivity: LoginActivity)
}