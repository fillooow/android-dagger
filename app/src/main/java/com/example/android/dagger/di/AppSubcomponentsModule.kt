package com.example.android.dagger.di

import com.example.android.dagger.registration.RegistrationSubcomponent
import dagger.Module

@Module(subcomponents = [RegistrationSubcomponent::class])
class AppSubcomponentsModule