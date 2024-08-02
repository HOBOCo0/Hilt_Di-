package com.example.hilt_di

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent

@InstallIn(ActivityComponent::class)
@Module
abstract class UserModule {
//    @Provides
//    fun providesUserRepository(): UserRepository{
//        return FirebaseRepository()
//    }
//    @Provides
//    fun providesUserRepository(sqlRepository: SQLRepository): UserRepository{
//        return sqlRepository
//    }

    @Binds
    abstract fun bindsUserRepository(sqlRepository: SQLRepository): UserRepository
}