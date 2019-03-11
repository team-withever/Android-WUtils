package com.withever.wutils.extension

import android.app.Activity
import android.util.Log

var isLogDebug = false

fun Activity.logd(message: String){
    if (isLogDebug) Log.d(this::class.java.simpleName, message)
}