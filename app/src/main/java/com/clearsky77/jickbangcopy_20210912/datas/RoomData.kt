package com.clearsky77.jickbangcopy_20210912.datas

import java.io.Serializable
import java.text.NumberFormat
import java.util.*

class RoomData (
    val price: Int,
    val address: String,
    val floor: Int,
    val description: String) : Serializable {

    fun getFormattedPrice():String{
        // 1. 1억이 넘지 않는 경우
        // 2. 그 외 => ?억 ????으로 표현
        if(this.price<10000){
        // 8000이라면 8,000로 적용하기
            val formattedStr = NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)
            return formattedStr
        }else{
            // 1억이 넘으면 억을 표시해준다
            val uk = ( this.price / 10000 ).toString() // 정수에 정수를 나누면 소수점 아래자리를 버린다.
            val rest = this.price % 10000
            if(rest.equals(0)){ // 1억일 경우 1억 0 과 같이 표현되므로, 0을 없애고 단순하게 1억으로 표현.
                val finalStr = "${uk}억"
                return finalStr
            }else{
                val restCommaStr = NumberFormat.getNumberInstance(Locale.KOREA).format(rest)
                val finalStr = "${uk}억 ${restCommaStr}"
                return finalStr
            }

        }
    }

    fun getFormattedFloor(): String {
        // 1. 양수인 경우 => "floor층"
        // 2. 0인 경우 => "반지하"
        // 3. 음수인 경우 => "지하?층"
        if(this.floor>0){
            return "${this.floor}층"
        }else if(this.floor==0){
            return "반지하"
        }else{
            return "지하${-this.floor}층" // -를 곱해서 지하를 표현
        }
    }

}