package com.example.coroutine.coroutineContext

import android.util.Log
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

object TestWithContext {

    fun testFirstWithContextFunc() {
        newSingleThreadContext("Context1").use { context1 ->
            Log.d("ahihi", "Context1 - Thread: ${Thread.currentThread().name}")
            newSingleThreadContext("Context2").use { context2 ->
                Log.d("ahihi", "Context2 - Thread: ${Thread.currentThread().name}")
                runBlocking(context1) {
                    Log.d("ahihi", "Working in context1 - Thread: ${Thread.currentThread().name}")
                    withContext(context2) {
                        Log.d("ahihi", "Working in context2 - Thread: ${Thread.currentThread().name}")
                    }
                    Log.d("ahihi", "Working in context1 - Thread: ${Thread.currentThread().name}")
                }
            }
        }
    }
}