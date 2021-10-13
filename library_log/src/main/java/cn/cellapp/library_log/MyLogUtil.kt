package cn.cellapp.library_log

import android.util.Log

class MyLogUtil {
    fun logMsg(msg: String) {
        Log.e("defaultTag", msg)
    }
}