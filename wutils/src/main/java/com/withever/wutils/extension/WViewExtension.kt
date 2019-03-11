package com.withever.wutils.extension

import android.app.Activity
import android.support.annotation.LayoutRes
import android.view.View

fun Activity.inflate(@LayoutRes layout: Int): View = this.layoutInflater.inflate(layout, null)
