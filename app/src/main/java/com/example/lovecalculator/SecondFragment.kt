package com.example.lovecalculator

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.lovecalculator.databinding.FragmentSecondBinding

class SecondFragment: Fragment() {
    private lateinit var binding: FragmentSecondBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val loveModel: LoveModel = arguments?.getSerializable("loveModel") as LoveModel
        with(binding) {
            firstName.text = loveModel.firstName
            secondName.text = loveModel.secondName
            tvResult.text = loveModel.result
            tvPercentage.text = loveModel.percentage
            listener()
        }


    }

    private fun listener() {
        binding.btn.setOnClickListener {
            findNavController().navigateUp()
        }


    }
}




