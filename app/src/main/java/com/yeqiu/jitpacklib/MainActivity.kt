package com.yeqiu.jitpacklib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.yeqiu.lib.JitPackLib

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.tv1).text = JitPackLib.getCurrentTime()
        findViewById<TextView>(R.id.tv2).text = JitPackLib.getLibName()
        findViewById<TextView>(R.id.tv3).text = JitPackLib.getVersion()


    }
}