package com.example.lovecalculator

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.example.lovecalculator.databinding.FragmentFirstBinding
import retrofit2.Response
import retrofit2.Call
import retrofit2.Callback


class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initClickers()
    }

    private fun initClickers() {
        with(binding) {
            lottieHeart.setOnClickListener {
                val firstName = binding.firstName.text.toString()
                val secondName = binding.secondName.text.toString()
                App.api.calculate(firstName, secondName).enqueue(object : Callback<LoveModel> {
                    override fun onResponse(call: Call<LoveModel>, response: Response<LoveModel>) {
                        if (response.isSuccessful) {
                            val loveModel = response.body()
                            val bundle = Bundle()
                            bundle.putSerializable("loveModel", loveModel)
                            findNavController().navigate(R.id.secondFragment, bundle)
                            //firstName.text.clear()
                            //secondName.text.clear()

                        }
                        Log.e("ololo", "onResponse: ${response.body()}")
                    }

                    override fun onFailure(call: Call<LoveModel>, t: Throwable) {
                        Log.e("ololo", "onFailure: ${t.message}")
                    }

                })
            }
        }
    }
}