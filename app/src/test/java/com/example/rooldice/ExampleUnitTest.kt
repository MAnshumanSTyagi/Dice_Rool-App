package com.example.rooldice

import org.junit.Assert.assertTrue
import org.junit.Test


class ExampleUnitTest {
    @Test
    fun generateNumber(){
        val dice=Dice(6)
        val no=dice.roll()
        assertTrue("The Result is not bw 1 and 6",no in 1..6)

    }

}