package com.example.hilt_di

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp // this annotation generates dagger code behind the scene
class UserApplication: Application() {
    @Inject
    lateinit var userRepository: UserRepository

    override fun onCreate() {
        super.onCreate()
        userRepository.saveUser("abc@xyz.com", "121212")
    }

}

/*
so, to use hilt we must define application class. From there the code generation begins means
dependency injection code will be triggered from Application class
 */