package com.oscarz.yu_gi_ohbinder.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import com.oscarz.yu_gi_ohbinder.R
import com.oscarz.yu_gi_ohbinder.TCGAPIConnector

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        TCGAPIConnector().getAuthToken()
        return super.onTouchEvent(event)
    }
}
