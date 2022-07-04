package com.example.android.dagger.login

import com.example.android.dagger.di.ActivityScope
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface LoginSubcomponent {

    // Factory to create instances of LoginSubcomponent
    @Subcomponent.Factory
    interface Factory {

        fun create(): LoginSubcomponent
    }

    fun inject(activity: LoginActivity)
}