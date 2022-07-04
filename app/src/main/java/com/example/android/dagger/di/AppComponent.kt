package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.login.LoginSubcomponent
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.registration.RegistrationSubcomponent
import com.example.android.dagger.settings.SettingsActivity
import com.example.android.dagger.user.UserManager
import com.example.android.dagger.user.UserSubcomponent
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

    /**
     * Expose [UserManager] so that [MainActivity] and [SettingsActivity]
     * can access a particular instance of [UserSubcomponent]
     * */
    fun userManager(): UserManager
}