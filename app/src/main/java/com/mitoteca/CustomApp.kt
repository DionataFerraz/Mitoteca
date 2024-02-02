package com.mitoteca

import android.app.Application
import com.mitoteca.di.DaggerAppComponent
import br.com.jarvis.scopes.ComponentHolder

class CustomApp : Application() {
    override fun onCreate() {
        super.onCreate()

        ComponentHolder.components += DaggerAppComponent.create()
    }
}