package com.wjthub.android.baselibrary.di.module

import com.wjthub.android.baselibrary.di.BaseApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(private var baseApplication: BaseApplication){
    @Provides
    @Singleton
    fun providesApplication() = baseApplication
}