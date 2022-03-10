package com.example.coroutine.exceptionHandler

import kotlinx.coroutines.*

//fun main() {
//    runBlocking {
//
//        val handler = CoroutineExceptionHandler { _,exception ->
//            println(exception)
//        }
//
//        val job1 = GlobalScope.launch(handler) {
//            println("Throw Exception from launch")
//            throw NullPointerException()
//        }
//        job1.join()
//
//        val result = GlobalScope.async {
//            println("Throw Exception from async")
//            throw IndexOutOfBoundsException()
//        }
//        try {
//            result.await()
//        } catch (e: IndexOutOfBoundsException) {
//            println("IndexOutOfBoundsException")
//        }
//
//    }
//
//}

fun main() {
    runBlocking {
//        val superVisorJob = SupervisorJob()
//        with(CoroutineScope(coroutineContext + superVisorJob)) {
//            val firstChild = launch {
//                println("FirstChile")
//                throw NullPointerException()
//            }
//            val secondChild = launch {
//                firstChild.join()
//                println("secondChild. FirstChile is active: ${firstChild.isActive}")
//                try {
//                    delay(1000)
//                } finally {
//                    println("secondChild cancelled")
//                }
//            }
//            firstChild.join()
//            println("Cancel SuperVisorJob")
//            superVisorJob.cancel()
//            secondChild.join()
//        }

        supervisorScope {
            val firstChild = launch {
                println("FirstChile")
                throw NullPointerException()
            }
            val secondChild = launch {
                firstChild.join()
                println("secondChild. FirstChile is active: ${firstChild.isActive}")
                try {
                    delay(1000)
                } finally {
                    println("secondChild cancelled")
                }
            }
            firstChild.join()
            secondChild.join()
        }
    }
}