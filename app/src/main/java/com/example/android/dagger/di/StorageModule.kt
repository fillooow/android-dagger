package com.example.android.dagger.di

import com.example.android.dagger.storage.SharedPreferencesStorage
import com.example.android.dagger.storage.Storage
import dagger.Binds
import dagger.Module

/**
 * Because of [Binds], [StorageModule] needs to be an abstract class
 * */
@Module
abstract class StorageModule {

    @Binds
    abstract fun provide(storage: SharedPreferencesStorage): Storage
}