package com.wjthub.android.baselibrary.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.wjthub.android.baselibrary.di.scope.UserScope
import com.wjthub.android.baselibrary.viewmodel.DefaultViewModel
import com.wjthub.android.baselibrary.viewmodel.ViewModelFactory
import com.wjthub.android.baselibrary.viewmodel.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@Module
abstract class ViewModelFactoryModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
    @UserScope
    @Binds
    @IntoMap
    @ViewModelKey(DefaultViewModel::class)
    abstract fun bindDefaultViewModel(defaultViewModel: DefaultViewModel):ViewModel

}