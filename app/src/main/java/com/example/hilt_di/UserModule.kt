package com.example.hilt_di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class UserModule {
    @Provides
    fun providesUserRepository(): UserRepository{
        return FirebaseRepository()
    }
}