package com.example.android.dagger.di

import com.example.android.dagger.login.LoginSubcomponent
import com.example.android.dagger.registration.RegistrationSubcomponent
import com.example.android.dagger.user.UserSubcomponent
import dagger.Module

@Module(
    subcomponents = [
        LoginSubcomponent::class,
        RegistrationSubcomponent::class,
        UserSubcomponent::class
    ]
)
class AppSubcomponentsModule