package com.wjthub.android.login.di

import com.wjthub.android.baselibrary.di.scope.UserScope
import com.wjthub.android.login.service.LoginService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class LoginModule {
    @UserScope
    @Provides
    internal fun providesLoginService(retrofit: Retrofit): LoginService {
        return retrofit.create(LoginService::class.java)
    }
}