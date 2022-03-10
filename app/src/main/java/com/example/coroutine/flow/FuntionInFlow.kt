package com.example.coroutine.flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

fun main() {
    val list = listOf(1, 2, 3, 4, 8, 9)

    runBlocking {
        //transform
        list.asFlow().transform { num ->
            emit(num * num)
            emit(num * num * num)
        }.collect {
            println(it)
        }

        //map
        list.asFlow().map { num ->
            num * num
        }.collect {
            println(it)
        }

        //take
        list.asFlow().take(2).collect {
            println(it)
        }

        //filter
        list.asFlow().filter { num ->
            num % 2 == 0
        }.collect {
            println(it)
        }

        //fold
        val sum = list.asFlow().fold(5) { sum, value ->
            print("sum = $sum and num = $value")
            sum + value
        }
        println(sum)

        //zip
        val num = (1..3).asFlow()/*.onEach { delay(100) }*/
        val text = listOf("mot", "hai", "ba").asFlow()/*.onEach { delay(200L) }*/
        val startTime = System.currentTimeMillis()
        num.zip(text) { num, text ->
            "(num = $num and text = $text)"
        }.collect {
            println("$it /*at ${System.currentTimeMillis()} - $startTime*/")
        }

        //flatmapConcat
//        var startTimeAt = System.currentTimeMillis()
//        (1..3).asFlow().onEach { delay(100) }
//            .flatMapConcat { requestFlow(it) }
//            .collect {
//                println("value = $it at ${System.currentTimeMillis() - startTimeAt}")
//            }

        //flatmapMerge
//        var startTimeAt = System.currentTimeMillis()
//        (1..3).asFlow().onEach { delay(100) }
//            .flatMapMerge { requestFlow(it) }
//            .collect {
//                println("value = $it at ${System.currentTimeMillis() - startTimeAt}")
//            }


        //flatmapLatest
        var startTimeAt = System.currentTimeMillis()
        (1..3).asFlow().onEach { delay(100) }
            .flatMapLatest { requestFlow(it) }
            .collect {
                println("value = $it at ${System.currentTimeMillis() - startTimeAt}")
            }
    }
}

fun requestFlow(i: Int) : Flow<String> = flow {
    emit("$i : First")
    delay(500)
    emit("$i : second")
}