package com.example.user.ejemplos.multipleComparison

/* Problem 3
// Create a function that will print
// "fizz" is the number is divisible by 3
// "buzz" is the number is divisible by 5
// "pizz" is the number is divisible by both
// and the integer for the rest
 You can use a for loop for using the first 20 integers
*/
class MultipleComparisonKotlin {
    companion object{
        fun getPhrase(value: Int): String =
            when {
                value % 3 == 0 && value % 5 == 0 -> "pizz"
                value % 3 == 0 -> "fizz"
                value % 5 == 0 -> "buzz"
                else -> value.toString()
            }
    }


}