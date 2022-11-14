package com.github.sirdeerhead.dailyspending.nav.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.github.sirdeerhead.dailyspending.databinding.FragmentHomeBinding

class Home : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private lateinit var newCashFlowViewModel: NewCashFlowViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        newCashFlowViewModel = ViewModelProvider(this)[NewCashFlowViewModel::class.java]

        binding.btnCashFlowButton.setOnClickListener {
            NewCashFlow().show(childFragmentManager,"newCashFlowTag")
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}