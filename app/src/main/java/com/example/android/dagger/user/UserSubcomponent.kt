package com.example.android.dagger.user

import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.settings.SettingsActivity
import dagger.Subcomponent

@LoggedUserScope
@Subcomponent
interface UserSubcomponent {

    @Subcomponent.Factory
    interface Factory {

        fun create(): UserSubcomponent
    }

    fun inject(activity: MainActivity)
    fun inject(activity: SettingsActivity)
}