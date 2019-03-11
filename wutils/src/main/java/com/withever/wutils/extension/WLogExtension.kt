package com.withever.wutils.extension

import android.app.Activity
import android.content.Context
import android.util.Log

var isLogDebug = false
var WLOG_TAG = "WLOG_TAG"

/**----------------------------------------------------
 * Common log
 *----------------------------------------------------*/
fun Activity.log(msg: String) {
    logd(msg)
}

fun Context.log(msg: String) {
    logd(msg)
}

/**----------------------------------------------------
 * Log debug
 *----------------------------------------------------*/
/**
 * Send a {@link #DEBUG} log message.
 * @param tag Used to identify the source of a log message.  It usually identifies
 *        the class or activity where the log call occurs.
 * @param msg The message you would like logged.
 */
fun Activity.logd(tag: String, msg: String) {
    if (isLogDebug) Log.d(tag, msg)
}

/**
 * Send a {@link #DEBUG} log message.
 * @param msg The message you would like logged.
 */
fun Activity.logd(msg: String) {
    if (isLogDebug) Log.d(WLOG_TAG, msg)
}

/**
 * Send a {@link #DEBUG} log message.
 * @param tag Used to identify the source of a log message.  It usually identifies
 *        the class or activity where the log call occurs.
 * @param msg The message you would like logged.
 */
fun Context.logd(tag: String, msg: String) {
    if (isLogDebug) Log.d(tag, msg)
}

/**
 * Send a {@link #DEBUG} log message.
 * @param msg The message you would like logged.
 */
fun Context.logd(msg: String) {
    if (isLogDebug) Log.d(WLOG_TAG, msg)
}


/**----------------------------------------------------
 * Log verbose
 *----------------------------------------------------*/
/**
 * Send a {@link #VERBOSE} log message.
 * @param tag Used to identify the source of a log message.  It usually identifies
 *        the class or activity where the log call occurs.
 * @param msg The message you would like logged.
 */
fun Activity.logv(tag: String, msg: String) {
    if (isLogDebug) Log.v(tag, msg)
}

/**
 * Send a {@link #VERBOSE} log message.
 * @param msg The message you would like logged.
 */
fun Activity.logv(msg: String) {
    if (isLogDebug) Log.v(WLOG_TAG, msg)
}

/**
 * Send a {@link #VERBOSE} log message.
 * @param tag Used to identify the source of a log message.  It usually identifies
 *        the class or activity where the log call occurs.
 * @param msg The message you would like logged.
 */
fun Context.logv(tag: String, msg: String) {
    if (isLogDebug) Log.v(tag, msg)
}

/**
 * Send a {@link #VERBOSE} log message.
 * @param msg The message you would like logged.
 */
fun Context.logv(msg: String) {
    if (isLogDebug) Log.v(WLOG_TAG, msg)
}


/**----------------------------------------------------
 * Log error
 *----------------------------------------------------*/
/**
 * Send an {@link #ERROR} log message.
 * @param tag Used to identify the source of a log message.  It usually identifies
 *        the class or activity where the log call occurs.
 * @param msg The message you would like logged.
 */
fun Activity.loge(tag: String, msg: String) {
    if (isLogDebug) Log.e(tag, msg)
}

/**
 * Send an {@link #ERROR} log message.
 * @param msg The message you would like logged.
 */
fun Activity.loge(msg: String) {
    if (isLogDebug) Log.e(WLOG_TAG, msg)
}

/**
 * Send an {@link #ERROR} log message.
 * @param tag Used to identify the source of a log message.  It usually identifies
 *        the class or activity where the log call occurs.
 * @param msg The message you would like logged.
 */
fun Context.loge(tag: String, msg: String) {
    if (isLogDebug) Log.e(tag, msg)
}

/**
 * Send an {@link #ERROR} log message.
 * @param msg The message you would like logged.
 */
fun Context.loge(msg: String) {
    if (isLogDebug) Log.e(WLOG_TAG, msg)
}


/**----------------------------------------------------
 * Log info
 *----------------------------------------------------*/
/**
 * Send an {@link #INFO} log message.
 * @param tag Used to identify the source of a log message.  It usually identifies
 *        the class or activity where the log call occurs.
 * @param msg The message you would like logged.
 */
fun Activity.logi(tag: String, msg: String) {
    if (isLogDebug) Log.i(tag, msg)
}

/**
 * Send an {@link #INFO} log message.
 * @param msg The message you would like logged.
 */
fun Activity.logi(msg: String) {
    if (isLogDebug) Log.i(WLOG_TAG, msg)
}

/**
 * Send an {@link #INFO} log message.
 * @param tag Used to identify the source of a log message.  It usually identifies
 *        the class or activity where the log call occurs.
 * @param msg The message you would like logged.
 */
fun Context.logi(tag: String, msg: String) {
    if (isLogDebug) Log.i(tag, msg)
}

/**
 * Send an {@link #INFO} log message.
 * @param msg The message you would like logged.
 */
fun Context.logi(msg: String) {
    if (isLogDebug) Log.i(WLOG_TAG, msg)
}


/**----------------------------------------------------
 * Log warning
 *----------------------------------------------------*/
/**
 * Send a {@link #WARN} log message.
 * @param tag Used to identify the source of a log message.  It usually identifies
 *        the class or activity where the log call occurs.
 * @param msg The message you would like logged.
 */
fun Activity.logw(tag: String, msg: String) {
    if (isLogDebug) Log.w(tag, msg)
}

/**
 * Send a {@link #WARN} log message.
 * @param msg The message you would like logged.
 */
fun Activity.logw(msg: String) {
    if (isLogDebug) Log.w(WLOG_TAG, msg)
}

/**
 * Send a {@link #WARN} log message.
 * @param tag Used to identify the source of a log message.  It usually identifies
 *        the class or activity where the log call occurs.
 * @param msg The message you would like logged.
 */
fun Context.logw(tag: String, msg: String) {
    if (isLogDebug) Log.w(tag, msg)
}

/**
 * Send a {@link #WARN} log message.
 * @param msg The message you would like logged.
 */
fun Context.logw(msg: String) {
    if (isLogDebug) Log.w(WLOG_TAG, msg)
}