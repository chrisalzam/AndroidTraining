package com.example.user.ejemplos.stringsDuplicate

import org.junit.Test

import org.junit.Assert.*

class StringsDuplicateKotlinTest {

    @Test
    fun emptyDuplicates() {
        val classInstance = StringsDuplicateKotlin()
        val result = classInstance.duplicates(emptyList())
        assertEquals(0, result)
    }

    @Test
    fun oneDuplicate() {
        val classInstance = StringsDuplicateKotlin()
        val result = classInstance.duplicates(listOf("1", "2", "1", "3", "4"))
        assertEquals(1, result)
    }

    @Test
    fun twoDuplicates() {
        val classInstance = StringsDuplicateKotlin()
        val result = classInstance.duplicates(listOf("1", "1", "2", "4", "4"))
        assertEquals(2, result)
    }

    @Test
    fun threeDuplicates() {
        val classInstance = StringsDuplicateKotlin()
        val result = classInstance.duplicates(listOf("1", "1", "2", "1", "1"))
        assertEquals(3, result)
    }
}