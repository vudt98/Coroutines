package com.example.coroutine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.coroutine.coroutineContext.TestDispatcher
import com.example.coroutine.coroutineContext.TestWithContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TestDispatcher.testDispatcher()

//        TestWithContext.testFirstWithContextFunc()

    }
}