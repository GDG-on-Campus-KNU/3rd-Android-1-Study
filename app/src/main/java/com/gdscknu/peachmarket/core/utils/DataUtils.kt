package com.gdscknu.peachmarket.core.utils

import java.time.LocalDateTime

object DataUtils {
    fun getTimeDifference(date: LocalDateTime): String{
        return ""
    }

    fun localDateTimeToString(date: LocalDateTime)=
        "${date.monthValue}월 ${date.dayOfMonth}일 - ${date.hour}시 ${date.minute}분"

    fun longToMoneyString(price: Long): String {
        val priceString = price.toString()
        val length = priceString.length
        val stringBuilder = StringBuilder()
        for(i in 0 until length){
            stringBuilder.append(priceString[i])
            if((length - i - 1) % 3 == 0 && i != length - 1){
                stringBuilder.append(",")
            }
        }
        stringBuilder.append("원")
        return stringBuilder.toString()
    }
}