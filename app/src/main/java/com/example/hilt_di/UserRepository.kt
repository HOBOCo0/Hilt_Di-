package com.example.hilt_di

import android.util.Log
import javax.inject.Inject

const val TAG = "MyTag"

interface UserRepository {
    fun saveUser(email: String, password: String)
}

class SQLRepository @Inject constructor() : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG,"User saved in DB")
    }
}

class FirebaseRepository @Inject constructor() : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG,"User saved in Firebase")
    }
}