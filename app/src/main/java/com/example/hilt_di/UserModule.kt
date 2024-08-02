package com.example.hilt_di

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@InstallIn(ActivityComponent::class)
@Module
 class UserModule {
//    @Provides
//    fun providesUserRepository(): UserRepository{
//        return FirebaseRepository()
//    }
    @Provides
//    @Named("sql")
    @SqlQualifier
    fun providesSQLRepository(sqlRepository: SQLRepository): UserRepository{
        return sqlRepository
    }

    @Provides
//    @Named("firebase")
    @FirebaseQualifier
    fun providesFirebaseRepository(): UserRepository{
        return FirebaseRepository()
    }

//    @Binds
//    abstract fun bindsUserRepository(sqlRepository: SQLRepository): UserRepository


}