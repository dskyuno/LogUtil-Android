package cn.cellapp.library_error

import android.util.Log

class MyErrorUtil {
    fun showError(msg: String) {
        Log.e("defaultTag", msg)
    }
}