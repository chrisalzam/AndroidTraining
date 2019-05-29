package com.example.user.personal_file;

import java.util.Scanner;

public class Ejemplos {
    //    Problem 2
    //    Create function to check if the string is a palindrome
    public static void main(String[] args) {
        System.out.println("Escribe una palabra:");
        Scanner palabra = new Scanner(System.in); //Creación de un objeto Scanner
        String p = palabra.nextLine(); //Invocamos un método sobre un objeto Scanner
        Palindromo(p);
    }

    private static void Palindromo(String word)
    {
        boolean esPalindromo=false;

        for (int i=0;i<word.length()/2;i++)
        {

        }
        System.out.println(word+" mide " +word.length());
    }
}