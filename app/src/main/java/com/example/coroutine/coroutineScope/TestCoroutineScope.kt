package com.example.coroutine.coroutineScope

import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

fun main() {
//    runBlocking {
//    }
//
//    CoroutineScope(Dispatchers.Main).launch {
//    }
//
//    GlobalScope.launch {
//    }
//
//    MyScope().launch {
//
//    }

    runBlocking {
        val job1 = launch {
            launch {
                delay(100L)
                println("coroutine 1:Hello")
                delay(1000L)
                println("coroutine 1:Goodbye")
            }
            launch {
                delay(100L)
                println("coroutine 2:Hello")
                delay(1000L)
                println("coroutine 2:Goodbye")
            }
//            GlobalScope.launch {
//                delay(100L)
//                println("Coroutine 3: hello")
//                delay(1000L)
//                println("Coroutine 3: Goodbye")
//            }
        }

        delay(500L)
        job1.cancel()
//        delay(1000L)
    }
}

class MyScope() : CoroutineScope {
    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main
}

//fun main() {
//    runBlocking {
//        val job1 = launch {
//            repeat(3) {
//                launch {
//                    delay(100L)
//                    println("hello $it")
//                }
//            }
//            println("print from parent")
//        }
//        job1.join()
//        println("Done!")
//    }
//}
