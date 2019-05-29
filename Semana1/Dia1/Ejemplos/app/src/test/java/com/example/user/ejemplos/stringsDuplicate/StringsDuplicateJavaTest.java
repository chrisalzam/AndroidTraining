package com.example.user.ejemplos.stringsDuplicate;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class StringsDuplicateJavaTest {

    @Test
    public void emptyDuplicates() {
        StringsDuplicateJava classInstance = new StringsDuplicateJava();
        List<String> result = classInstance.duplicates(Collections.<String>emptyList());
        assertEquals(0, result.size());
    }

    @Test
    public void oneDuplicate() {
        StringsDuplicateJava classInstance = new StringsDuplicateJava();
        List<String> result = classInstance.duplicates(Arrays.asList("1", "2", "1", "3", "4"));
        assertEquals(1, result.size());
    }

    @Test
    public void twoDuplicates() {
        StringsDuplicateJava classInstance = new StringsDuplicateJava();
        List<String> result = classInstance.duplicates(Arrays.asList("1", "1", "2", "4", "4"));
        assertEquals(2, result.size());
    }

    @Test
    public void threeDuplicates() {
        StringsDuplicateJava classInstance = new StringsDuplicateJava();
        List<String> result = classInstance.duplicates(Arrays.asList("1", "1", "2", "1", "1"));
        assertEquals(3, result.size());
    }
}