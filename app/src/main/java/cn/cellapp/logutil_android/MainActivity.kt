package cn.cellapp.logutil_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cn.cellapp.library_error.MyErrorUtil
import cn.cellapp.library_log.MyLogUtil

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MyLogUtil().logMsg("打印")
        MyErrorUtil().showError("error")
    }
}