package com.osg.practice01kotlin

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

class RetrofitHelper {

    fun getRetrofit():Retrofit{
        val builder= Retrofit.Builder()
        builder.baseUrl("http://www.kobis.or.kr")
        builder.addConverterFactory(GsonConverterFactory.create())

        return builder.build()
    }

    fun getString():Retrofit{
        val builder= Retrofit.Builder()
        builder.baseUrl("http://www.kobis.or.kr")
        builder.addConverterFactory(ScalarsConverterFactory.create())

        return builder.build()
    }


}