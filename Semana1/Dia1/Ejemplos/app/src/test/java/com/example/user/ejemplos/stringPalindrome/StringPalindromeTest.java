package com.example.user.ejemplos.stringPalindrome;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringPalindromeTest {

    @Test
    public void isPalindrome() {
        StringPalindrome classinstance = new StringPalindrome();
        Boolean result = classinstance.isPalindrome("aNITA LAVA LA TINA");
//        assertArrayEquals(true, result);
        assertTrue(result);
//        assertFalse(!result);
    }@Test
    public void isPalindrome2() {
        StringPalindrome classinstance = new StringPalindrome();
        Boolean result = classinstance.isPalindrome("oso");
//        assertArrayEquals(true, result);
        assertTrue(result);
//        assertFalse(!result);
    }
}