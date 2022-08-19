package com.example.lovecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Window
import android.view.WindowManager
import androidx.navigation.findNavController
import com.example.lovecalculator.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val win: Window = window
        win.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        //val navController = findNavController(R.id.nav_host_fragment)
    }
        }

    //private fun doRequest(firstName:String,secondName:String) {
      //  App.api.calculate(firstName,secondName).enqueue(object : retrofit2.Callback<LoveModel> {
        //    override fun onResponse(call: Call<LoveModel>, response: Response<LoveModel>) {
          //      Log.e("ololo", "onResponse:${response.body()}")}

            //override fun onFailure(call: Call<LoveModel>, t: Throwable) {
                //Log.e("ololo", "onFailure:${t.message}") }
        //})
    //}}