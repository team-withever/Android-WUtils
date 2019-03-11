package com.withever.wutils.extension

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.support.v4.app.ActivityOptionsCompat
import android.support.v4.view.ViewCompat
import android.view.View

/**----------------------------------------------------
 * Activity intent
 *----------------------------------------------------*/
inline fun <reified T : Any> Activity.start(
    requestCode: Int = -1,
    options: Bundle? = null,
    noinline init: Intent.() -> Unit = {}
) {
    val intent = Intent(this, T::class.java)
    intent.init()

    if (Build.VERSION_CODES.JELLY_BEAN <= Build.VERSION.SDK_INT) {
        startActivityForResult(intent, requestCode, options)
    } else {
        startActivityForResult(intent, requestCode)
    }
}

inline fun <reified T : Any> Context.start(
    options: Bundle? = null,
    noinline init: Intent.() -> Unit = {}
) {
    val intent = Intent(this, T::class.java)
    intent.init()

    if (Build.VERSION_CODES.JELLY_BEAN <= Build.VERSION.SDK_INT) {
        startActivity(intent, options)
    } else {
        startActivity(intent)
    }
}


/**----------------------------------------------------
 * Activity transition
 *----------------------------------------------------*/
fun Activity.createTransition(view: View): ActivityOptionsCompat? {
    return ActivityOptionsCompat.makeSceneTransitionAnimation(
        this,
        view,
        ViewCompat.getTransitionName(view)!!
    )
}

fun Context.createTransition(view: View): ActivityOptionsCompat? {
    return ActivityOptionsCompat.makeSceneTransitionAnimation(
        this as Activity,
        view,
        ViewCompat.getTransitionName(view)!!
    )
}

fun Context.createTransition(vararg view: View): ActivityOptionsCompat? {
    val array: MutableList<android.support.v4.util.Pair<View, String>> = mutableListOf()
    view.mapTo(array) { android.support.v4.util.Pair.create(it, ViewCompat.getTransitionName(it)) }
    return ActivityOptionsCompat.makeSceneTransitionAnimation(
        this as Activity,
        *array.toTypedArray()
    )
}

