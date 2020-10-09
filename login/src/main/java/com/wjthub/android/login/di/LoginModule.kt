package com.wjthub.android.login.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.wjthub.android.baselibrary.di.scope.UserScope
import com.wjthub.android.baselibrary.viewmodel.DaggerViewModelFactory
import com.wjthub.android.baselibrary.viewmodel.ViewModelFactory
import com.wjthub.android.baselibrary.viewmodel.ViewModelKey
import com.wjthub.android.login.repository.LoginRepository
import com.wjthub.android.login.service.LoginService
import com.wjthub.android.login.service.LoginServiceImp
import com.wjthub.android.login.viewmodel.HomeViewModel
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class LoginModule {
    @UserScope
    @Provides
    internal fun providesLoginService(retrofit: Retrofit): LoginService {
        return retrofit.create(LoginService::class.java)
    }
}
