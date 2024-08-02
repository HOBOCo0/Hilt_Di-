package com.example.hilt_di

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class BlankFragment : Fragment() {

    @Inject
    lateinit var userRepository: UserRepository
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        userRepository.saveUser("xyz@abc.com", "a123bc45")
        return inflater.inflate(R.layout.fragment_blank, container, false)

    }


}