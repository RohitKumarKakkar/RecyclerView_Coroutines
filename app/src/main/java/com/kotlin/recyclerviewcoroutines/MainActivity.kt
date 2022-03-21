package com.kotlin.recyclerviewcoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.kotlin.recyclerviewcoroutines.RetrofitEssentials.ApiInterface
import com.kotlin.recyclerviewcoroutines.RetrofitEssentials.RetrofitHelper
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val call = RetrofitHelper.getInstance().create(ApiInterface::class.java)
        GlobalScope.launch {

            val list = call.getQuotes()
            list.body()?.results?.forEach {
                Log.d("list: ", it.content)
            }

        }

    }
}