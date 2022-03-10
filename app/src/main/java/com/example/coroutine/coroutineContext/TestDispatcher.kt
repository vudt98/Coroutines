package com.example.coroutine.coroutineContext

import android.util.Log
import kotlinx.coroutines.*

object TestDispatcher {

    @DelicateCoroutinesApi
    fun testDispatcher() {
        GlobalScope.launch(Dispatchers.Default) {
            Log.d("ahihi", "Dispatcher Default run on ${Thread.currentThread().name}")
        }
        GlobalScope.launch(Dispatchers.IO) {
            Log.d("ahihi", "Dispatcher IO run on ${Thread.currentThread().name}")
        }
        GlobalScope.launch(Dispatchers.Main) {
            Log.d("ahihi", "Dispatcher Main run on ${Thread.currentThread().name}")
        }
        GlobalScope.launch(Dispatchers.Unconfined) {
            Log.d("ahihi", "Dispatcher Unconfined run on ${Thread.currentThread().name}")
        }
        GlobalScope.launch(newSingleThreadContext("My thread")) {
            Log.d("ahihi", "Dispatcher My thread run on ${Thread.currentThread().name}")
        }
    }

}