package com.example.coroutine.flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
//        val test = hello(200)
//
//        hello(5).collect {
//            println(it)
//        }

//        withTimeoutOrNull(2500) {
//            hello(5).collect {
//                println(it)
//            }
//        }

//        (1..4).asFlow().collect {
//            println(it)
//        }
    }

}

fun hello(num: Int): Flow<Int> = flow {
    for (i in 0..num) {
        delay(1000)
        emit(i)
    }
}