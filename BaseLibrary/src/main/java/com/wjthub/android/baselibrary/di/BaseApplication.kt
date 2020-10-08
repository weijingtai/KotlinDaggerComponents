package com.wjthub.android.baselibrary.di

import android.app.Application
import com.wjthub.android.baselibrary.BuildConfig
import com.wjthub.android.baselibrary.di.component.BaseComponent
import com.wjthub.android.baselibrary.di.component.DaggerBaseComponent
import com.wjthub.android.baselibrary.di.module.AppModule

open class BaseApplication : Application() {

    companion object {
        lateinit var instance : BaseApplication
            private set
        lateinit var baseComponent: BaseComponent

    }
    override fun onCreate() {
        super.onCreate()
        instance = this
//        if(BuildConfig.DEBUG){
//            Bugtags.start(Constants.BUGTAGS_APPKEY_BETA, this, Bugtags.BTGInvocationEventNone)
//        } else run {
//            //release
//            Bugtags.start(Constants.BUGTAGS_APPKEY_LIVE, this, Bugtags.BTGInvocationEventNone)
//        }
        initializeInjector()

//        if (BuildConfig.DEBUG) {
//            ARouter.openLog() // 打印日志
//            ARouter.openDebug()   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
//        }
//        ARouter.init(this) // 尽可能早，推荐在Application中初始化
//        modulesApplicationInit()
    }
    fun initializeInjector(){
        baseComponent = DaggerBaseComponent.builder().appModule(AppModule(this)).build()
    }

//    private fun modulesApplicationInit() {
//        for (moduleImpl in ModuleConfig.MODULESLIST) {
//            try {
//                val clazz = Class.forName(moduleImpl)
//                val obj = clazz.newInstance()
//                (obj as? ApplicationImpl)?.onCreate(this)
//            } catch (e: ClassNotFoundException) {
//                e.printStackTrace()
//            } catch (e: IllegalAccessException) {
//                e.printStackTrace()
//            } catch (e: InstantiationException) {
//                e.printStackTrace()
//            }
//
//        }
//    }
}