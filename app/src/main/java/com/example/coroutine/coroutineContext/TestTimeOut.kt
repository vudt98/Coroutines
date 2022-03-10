package com.example.coroutine.coroutineContext

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout
import kotlinx.coroutines.withTimeoutOrNull

//fun main() {
//    runBlocking {
//        withTimeout(2000L) {
//            repeat(10) {
//                println("im ok $it")
//                delay(500)
//            }
//        }
//    }
//}

//fun main() {
//    runBlocking {
//        val result = withTimeoutOrNull(2000L) {
//            repeat(2) {
//                println("im ok $it")
//                delay(500)
//            }
//            "Done"
//        }
//        println(result)
//    }
//}