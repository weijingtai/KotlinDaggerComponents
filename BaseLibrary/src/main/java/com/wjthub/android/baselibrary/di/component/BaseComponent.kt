package com.wjthub.android.baselibrary.di.component

import com.wjthub.android.baselibrary.di.BaseApplication
import com.wjthub.android.baselibrary.di.module.AppModule
import com.wjthub.android.baselibrary.network.NetModule
import dagger.Component
import retrofit2.Retrofit
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule :: class, NetModule::class))
interface BaseComponent{
    fun provideRetrofit() : Retrofit
    fun providesApplication() : BaseApplication
}