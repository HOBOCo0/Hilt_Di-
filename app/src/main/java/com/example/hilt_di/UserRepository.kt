package com.example.hilt_di
import android.util.Log
import javax.inject.Inject

const val TAG = "MyTag"

class UserRepository @Inject constructor( private val loggrService: LoggerService){
    fun saveUser(email: String, password: String){
        loggrService.log("user saved in DBD")
    }
}