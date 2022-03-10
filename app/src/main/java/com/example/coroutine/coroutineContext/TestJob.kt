package com.example.coroutine.coroutineContext

import kotlinx.coroutines.*

//fun main() {
//
//    val job1 = GlobalScope.launch {
//        delay(1000L)
//        println("Hello")
//    }
//
//    val job2 = GlobalScope.launch {
//        job1.join()
//        delay(1000L)
//        println("word")
//    }
//
//    Thread.sleep(3000L)
//}

//fun main() {
//    runBlocking {
//        val job1 = launch {
//            repeat(1000) {
//                delay(500L)
//                println("hello $it")
//            }
//        }
//        delay(2000L)
//        job1.cancel()
//        println("im cancel")
//    }
//}

//fun main() {
//    runBlocking {
//        var time = System.currentTimeMillis()
//        val job = launch(Dispatchers.Default) {
//            var nextTime = time
//            var i = 0
//            while (i < 5) {
//                if (System.currentTimeMillis() >= nextTime) {
//                    println("hello ${i++}")
//                    nextTime += 500
//                }
//            }
//        }
//        delay(1300L)
//        println("Cancel coroutine")
//        job.cancelAndJoin()
//        println("Done!")
//    }
//}

//fun main() {
//    runBlocking {
//        val job = launch(Dispatchers.Default) {
//            try {
//                repeat(1000) {
//                    delay(100L)
//                    println("Hello")
//                }
//            } finally {
//                println("Im quit")
////                delay(100L)
////                println("print me")
//            }
//        }
//        delay(500L)
//        println("Cancel coroutine")
//        job.cancel()
//    }
//}

//fun main() {
//    runBlocking {
//        val job = launch(Dispatchers.Default) {
//            try {
//                repeat(1000) {
//                    delay(100L)
//                    println("Hello")
//                }
//            } finally {
//                println("Im quit")
//                withContext(NonCancellable) {
//                    repeat(5) {
//                        delay(100L)
//                        println("im alive")
//                    }
//                }
//            }
//        }
//        delay(500L)
//        println("Cancel coroutine")
//        job.cancel()
//    }
//}

