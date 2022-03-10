package com.example.coroutine.coroutineContext

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() {
    runBlocking {
        val timer = measureTimeMillis {
            val a = myWork1()
            val b = myWork2()
            println(a+b)
        }
        println("Timer1 $timer")

        val timer2 = measureTimeMillis {
            val a = async { myWork1() }
            val b = async { myWork2() }
            println(a.await() + b.await())
        }
        println("Timer2 $timer2")
    }
}

suspend fun myWork1(): Int {
    delay(1000L)
    return 10
}

suspend fun myWork2(): Int {
    delay(1000L)
    return 20
}