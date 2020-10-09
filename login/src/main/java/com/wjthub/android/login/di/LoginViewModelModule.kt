package com.wjthub.android.login.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.wjthub.android.baselibrary.di.scope.UserScope
import com.wjthub.android.baselibrary.viewmodel.ViewModelFactory
import com.wjthub.android.baselibrary.viewmodel.ViewModelKey
import com.wjthub.android.login.viewmodel.HomeViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class LoginViewModelModule {
    @UserScope
    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    abstract fun homeViewModel(viewModel: HomeViewModel): ViewModel
    @UserScope
    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

}