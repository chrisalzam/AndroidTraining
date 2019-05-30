package com.example.user.ejemplos.checkAnagram

import org.junit.Test

import org.junit.Assert.*

class CheckAnagramTest {

    @Test
    fun isAnagram1() {
        val classInstance=CheckAnagram()
        val result=classInstance.isAnagram("coat","taco")
        assertTrue(result)
    }

    @Test
    fun isAnagram2() {
        val classInstance = CheckAnagram()
        val result = classInstance.isAnagram("asa", "ass")
        assertFalse(result)
    }

    @Test
    fun isAnagram3() {
        val classInstance = CheckAnagram()
        val result = classInstance.isAnagram("COAT ", "taco")
        assertTrue(result)
    }

    @Test
    fun isAnagram4() {
        val classInstance = CheckAnagram()
        val result = classInstance.containsSameChars("coat", "taco")
        assertTrue(result)
    }

    @Test
    fun isAnagram5() {
        val classInstance = CheckAnagram()
        val result = classInstance.containsSameChars("asa", "ass")
        assertFalse(result)
    }

    @Test
    fun isAnagram6() {
        val classInstance = CheckAnagram()
        val result = classInstance.containsSameChars("COAT ", "taco")
        assertTrue(result)
    }
}