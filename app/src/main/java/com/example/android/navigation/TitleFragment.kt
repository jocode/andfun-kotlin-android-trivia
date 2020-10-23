package com.example.android.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.android.navigation.databinding.FragmentTitleBinding

class TitleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding : FragmentTitleBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_title, container, false)

        binding.playButton.setOnClickListener {view ->
            // Navigate to other fragment Game
            view.findNavController().navigate(R.id.action_titleFragment_to_gameFragment)
            // Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_gameFragment)
        }

        setTitleFragment()

        return binding.root
    }

    private fun setTitleFragment() {
        (activity as AppCompatActivity).supportActionBar?.title = getString(R.string.app_name)
    }

}