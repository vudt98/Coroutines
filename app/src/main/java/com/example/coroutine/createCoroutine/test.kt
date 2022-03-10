package com.example.coroutine.createCoroutine

import kotlinx.coroutines.*

@DelicateCoroutinesApi
fun main() {
//    GlobalScope.launch {
//        delay(1000L)
//        println("hello")
//    }
//    println("word")
//    Thread.sleep(2000L)

    runBlocking {
        println("hello")
        delay(1000L)
        println("word")
    }
}