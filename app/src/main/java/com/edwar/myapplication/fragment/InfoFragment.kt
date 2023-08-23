package com.edwar.myapplication.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.edwar.myapplication.databinding.FragmentInfoBinding


class InfoFragment : Fragment() {
    private lateinit var binding: FragmentInfoBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentInfoBinding.inflate(inflater, container,false)
        return binding.root
    }
}