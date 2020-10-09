package com.wjthub.android.login.di

import com.wjthub.android.baselibrary.di.component.BaseComponent
import com.wjthub.android.baselibrary.di.scope.UserScope
import com.wjthub.android.login.LoginActivity
import com.wjthub.android.login.ui.fragment.LoginHomeFragment
import dagger.Component


@UserScope
@Component(modules = [LoginViewModelModule::class,LoginModule::class],dependencies = [BaseComponent::class])
interface LoginComponent {
    open fun inject(loginActivity: LoginActivity)
    open fun inject(loginHomeFragment: LoginHomeFragment)
}