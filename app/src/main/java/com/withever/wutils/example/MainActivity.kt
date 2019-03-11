package com.withever.wutils.example

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.withever.wutils.extension.WLOG_TAG
import com.withever.wutils.extension.isLogDebug
import com.withever.wutils.extension.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showLog()
    }

    private fun showLog() {
        isLogDebug = true
        WLOG_TAG = "WUtils"
        log("Log Test")
    }
}
