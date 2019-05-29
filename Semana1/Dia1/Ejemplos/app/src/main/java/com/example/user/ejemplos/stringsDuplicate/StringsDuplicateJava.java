package com.example.user.ejemplos.stringsDuplicate;

import java.util.ArrayList;
import java.util.List;

//    Problem 1
//    Create a function to print the duplicates in a list of strings
public class StringsDuplicateJava {
    public List<String> duplicates(List<String> values) {
        List<String> result = new ArrayList<String>();
        List<String> tested = new ArrayList<String>();
//        1,2,1,3,4
//        System.out.println(); values[i]
        for (int i = 0; i < values.size(); i++) {
            if (tested.contains(values.get(i))) {
                continue;
            }
            tested.add(values.get(i));
            for (int j = i + 1; j < values.size(); j++) {
                if (values.get(i).equals(values.get(j))) {
                    result.add(values.get(j));
                }
            }
        }
        return result;
    }
}