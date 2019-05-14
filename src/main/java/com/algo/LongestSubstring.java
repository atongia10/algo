package com.algo;

// Longest substring without repeating characters.

public class LongestSubstring {

    public static void main(String[] args) {

        String inputString = "abcabcabc";
        int sum = 0;
        for(int i=0;i<inputString.toCharArray().length-1;i++){
            if(inputString.toCharArray()[i] != inputString.toCharArray()[i+1]){
                sum ++;
            }else {
                sum = 0;
            }
        }
    }

}
