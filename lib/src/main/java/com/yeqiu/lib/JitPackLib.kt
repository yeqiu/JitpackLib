package com.yeqiu.lib

import java.text.SimpleDateFormat
import java.util.Date

/**
 * @author：小卷子
 * @date 2024/1/16
 * @describe：
 * @fix：
 */
object JitPackLib {

    fun getCurrentTime(): String {
        val date = Date()
        val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        return simpleDateFormat.format(date)
    }


    fun getLibName(): String = "JetPackLib"


    fun getVersion()= "1.0.0"

}