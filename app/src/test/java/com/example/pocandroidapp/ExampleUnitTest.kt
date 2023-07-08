package com.example.pocandroidapp

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        test(1, null)
        assertEquals(4, 2 + 2)
    }

    fun test(param1: Int, param2: String?): String{
        return "Stuff $param1 $param2"
    }
}