package com.osg.practice01kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_second.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var items = ArrayList<DailyBoxOfficeList>()


        //영화진흥위원회 리사이클러뷰로 보여주기
        var retrofit = RetrofitHelper().getRetrofit()
        var retrofitService = retrofit.create(RetrofitService::class.java)
        var call=retrofitService.getJson()

        call.enqueue(object:Callback<MovieItem>{
            override fun onFailure(call: Call<MovieItem>, t: Throwable) {}

            override fun onResponse(call: Call<MovieItem>, response: Response<MovieItem>) {
                if(response.isSuccessful){
                    val movieItem=response.body()
                    var lists:ArrayList<DailyBoxOfficeList> = movieItem!!.boxOfficeResult!!.dailyBoxOfficeList!!
                    for(list in lists){
                        items.add(list)
                    }
                    recycler.adapter=MyAdapter(this@SecondActivity, items)
                }


            }

        })

    }
}