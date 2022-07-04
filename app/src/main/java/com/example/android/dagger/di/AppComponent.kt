package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.login.LoginSubcomponent
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.registration.RegistrationSubcomponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        StorageModule::class,
        AppSubcomponentsModule::class
    ]
)
interface AppComponent {

    @Component.Factory
    interface Factory {

        /** [BindsInstance] provides objects, that are constructed outside of the graph */
        fun create(@BindsInstance context: Context): AppComponent
    }

    // Expose Subcomponents factories from the graph
    fun loginComponent(): LoginSubcomponent.Factory
    fun registrationComponent(): RegistrationSubcomponent.Factory

    fun inject(activity: MainActivity)
}