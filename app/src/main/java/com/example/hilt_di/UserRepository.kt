package com.example.hilt_di
import android.util.Log
import javax.inject.Inject

const val TAG = "MyTag"

class UserRepository @Inject constructor(){
    fun saveUser(email: String, password: String){
        Log.d(TAG, "user saved in DB")
    }
}