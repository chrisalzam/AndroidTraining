package com.example.user.personal_file;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CodeReview {

    //region Problems
    //    Problem 1
    //    Create a function to print the duplicates in a list of strings


    //    Problem 2
    //    Create function to check if the string is a palindrome

    //    Problem 3
    //    Create a function that will print
    //      "fizz" is the number is divisible by 3
    //      "buzz" is the number is divisible by 5
    //      "fizz" is the number is divisible by both
    //      and the integer for the rest
    //     You can use a for loop for using the first 20 integers

    //    Problem 4
    //    Create a function to check if the two strings are Anagrams
    //    Eg COAT and TACO would be anagrams

    //    Problem 5
    //    Print a multiplication table from 1 to 10 using multidimensional array
    //    Output
    //    1 2 3 4 5 6 7 8 9 10
    //    2 4 6 8 10 12 14 16 18 20
    //endregion

    public static void main(String[] args) {

        //region Problem 1 - Duplicates
        System.out.println("Problem 1 - Duplicates Check");
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("c");
        list.add("d");
        list.add("d");

        printDuplicates(list);
        //endregion


    }

    private static void printDuplicates(List<String> lst) {
        List<String> duplicates = new ArrayList<>();

        for(String str: lst) {
            if(Collections.frequency(lst, str) > 1 && !duplicates.contains(str)) {
                duplicates.add(str);
            }
        }

        if(duplicates.size() <= 0) {
            System.out.println("No duplicates found!");
            return;
        }

        for(String str: duplicates) {
            System.out.println(str);
        }
    }


}