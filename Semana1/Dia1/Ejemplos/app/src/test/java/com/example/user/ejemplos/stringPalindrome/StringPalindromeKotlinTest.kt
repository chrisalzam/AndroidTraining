package com.example.user.ejemplos.stringPalindrome

import org.junit.Test

import org.junit.Assert.*

class StringPalindromeKotlinTest {

    @Test
    fun isPalindrome() {
        val classInstance= StringPalindromeKotlin()
        val result=classInstance.isPalindrome("ANITA LAVA LA TINA")
        assertTrue(result)
    }

    @Test
    fun isPalindrome2() {
        val classInstance= StringPalindromeKotlin()
        val result=classInstance.isPalindrome("Oso")
        assertTrue(result)
    }
}