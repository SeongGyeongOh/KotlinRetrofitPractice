package com.osg.practice01kotlin

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitService {
    @GET("/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=cb6d6dc84dcac76d321a14951b39b545&targetDt=20200629")
    fun getJson() : Call<MovieItem>

    @GET("/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=cb6d6dc84dcac76d321a14951b39b545&targetDt=20200629")
    fun getString() : Call<String>
}