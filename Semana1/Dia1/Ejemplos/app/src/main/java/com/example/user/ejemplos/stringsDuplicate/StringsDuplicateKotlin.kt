package com.example.user.ejemplos.stringsDuplicate

import java.util.ArrayList

//    Problem 1
//    Create a function to print the duplicates in a list of strings
class StringsDuplicateKotlin {
    fun duplicates(values: List<String>): Int =
        values.groupingBy { valor ->
            valor
        }.eachCount().filter { it.value > 1 }.values.sumBy { it - 1 }
}
