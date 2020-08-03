package com.osg.practice01kotlin

import java.util.*

class MovieItem {
    var boxOfficeResult: BoxOfficeSecond? = null
}

class BoxOfficeSecond {
    var boxofficeType: String? = null
    var showRange: String? = null
    var dailyBoxOfficeList: ArrayList<DailyBoxOfficeList>? = null
}

class DailyBoxOfficeList {
    var rnum: String? = null
    var rank: String? = null
    var rankInten: String? = null
    var rankOldAndNew: String? = null
    var movieCd: String? = null
    var movieNm: String? = null
    var openDt: String? = null
    var salesAmt: String? = null
    var salesShare: String? = null
    var salesInten: String? = null
    var salesChange: String? = null
    var salesAcc: String? = null
    var audiCnt: String? = null
    var audiInten: String? = null
    var audiChange: String? = null
    var audiAcc: String? = null
    var scrnCnt: String? = null
    var showCnt: String? = null

}