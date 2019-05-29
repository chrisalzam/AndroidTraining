package com.example.user.ejemplos.stringPalindrome

class StringPalindromeKotlin {
    fun isPalindrome(sentence: String): Boolean {
        val formattedSentence = sentence.replace("\\s".toRegex(), "").toLowerCase()
        return formattedSentence == formattedSentence.reversed()
    }

}