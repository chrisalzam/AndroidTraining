package com.example.user.ejemplos.stringPalindrome;

import java.util.ArrayList;

//    Problem 2//    Create function to check if the string is a palindrome
public class StringPalindrome {
    public Boolean isPalindrome(String word) {
        word = word.replaceAll(" ", "").toLowerCase();
        int flag = 0;
        int inc = 0, dec = word.length() - 1;
//        System.out.print(word);
//        ANITALAVALATINA 0 AL 14
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(inc) == word.charAt(dec) && inc != dec) {
                flag++;
                inc++;
                dec--;
            }
        }
        if (flag >= word.length() / 2) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }
}
