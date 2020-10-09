package com.wjthub.android.baselibrary.network

import com.google.gson.GsonBuilder
import com.wjthub.android.baselibrary.BaseApplication
import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
class NetModule{
    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient) : Retrofit {
//        return Retrofit.Builder()
//                .client(okHttpClient)
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//                .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
//                .baseUrl(NetParams.BASE_URL)
//                .build()
        return Retrofit.Builder()
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .baseUrl("http://192.168.0.237")
            .build()
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(app : BaseApplication) : OkHttpClient{
        val cacheDir = File(app.cacheDir,"http")
        val cache = Cache(cacheDir,5 * 1024 * 1024)
//        return OkHttpClient.Builder()
//                .cache(cache)
//                .connectTimeout(10, TimeUnit.SECONDS)
//                .addInterceptor(getLoggingInterceptor())
//                .build()
        return OkHttpClient.Builder()
            .cache(cache)
            .connectTimeout(10, TimeUnit.SECONDS)
            .build()
    }

//    fun getLoggingInterceptor():HttpLoggingInterceptor{
//        val loggingInterceptor = HttpLoggingInterceptor(object : HttpLoggingInterceptor.Logger {
//            override fun log(message: String?) {
//                LogUtil.i("retrofit:" + message)
//            }
//        })
//        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
//        return loggingInterceptor
//    }
}