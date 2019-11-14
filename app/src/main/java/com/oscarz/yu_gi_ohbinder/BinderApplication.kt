package com.oscarz.yu_gi_ohbinder

import android.app.Application
import android.content.Context

class BinderApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext
    }

    companion object{
        var appContext: Context? = null
    }

}