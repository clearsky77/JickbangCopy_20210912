package com.clearsky77.jickbangcopy_20210912.datas

import java.text.NumberFormat
import java.util.*

class RoomData (
    val price: Int,
    val address: String,
    val floor: Int,
    val description: String) {

    fun getFormattedPrice():String{
        // 1. 1억이 넘지 않는 경우
        // 2. 그 외 => ?억 ????으로 표현
        if(price<10000){
        // 8000이라면 8,000로 적용하기
            val formattedStr = NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)
            return formattedStr
        }else{
            // 1억이 넘으면 억을 표시해준다
            val uk = ( this.price / 10000 ).toString() // 정수에 정수를 나누면 소수점 아래자리를 버린다.
            val rest = this.price % 10000
            val restCommaStr = NumberFormat.getNumberInstance(Locale.KOREA).format(rest)
            val finalStr = "${uk}억 ${restCommaStr}"

            return finalStr

        }

    }

    }