package com.oop.mahadi.demo1comnum;

import java.util.HashSet;
import java.util.Set;

public class StringValidator {

    public static boolean isValidString(String str) {

        Set<Character> charSet = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (!charSet.add(c)) { // If character already exists in set, it's a duplicate
                return false;
            }
        }
        // Check length
        if(    (str.length() <= 7)){
            return true;
        }




        // Check for duplicate characters using a set


        // All conditions passed
        return true;
    }

//    public static void main(String[] args) {
//        // Test cases
//        String str1 = "abcdefg";   // Valid string
//        String str2 = "abcdeff";   // Invalid (duplicate 'f')
//        String str3 = "1234567";   // Valid string
//        String str4 = "ab";        // Invalid (length not 7)
//
//        System.out.println(str1 + " is valid: " + isValidString(str1));
//        System.out.println(str2 + " is valid: " + isValidString(str2));
//        System.out.println(str3 + " is valid: " + isValidString(str3));
//        System.out.println(str4 + " is valid: " + isValidString(str4));
//    }
}

