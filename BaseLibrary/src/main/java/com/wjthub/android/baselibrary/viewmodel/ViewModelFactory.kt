package com.wjthub.android.baselibrary.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.wjthub.android.baselibrary.di.scope.UserScope
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton

@UserScope
class ViewModelFactory @Inject constructor(private val viewModels: MutableMap<Class<out ViewModel>, Provider<ViewModel>>) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T = viewModels[modelClass]?.get() as T
}