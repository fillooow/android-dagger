package com.example.android.dagger.di

import com.example.android.dagger.login.LoginSubcomponent
import com.example.android.dagger.registration.RegistrationSubcomponent
import dagger.Module

@Module(
    subcomponents = [
        LoginSubcomponent::class,
        RegistrationSubcomponent::class
    ]
)
class AppSubcomponentsModule