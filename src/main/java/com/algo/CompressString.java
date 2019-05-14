package com.algo;

public class CompressString {

    public static void main(String[] args) {
        String testString = "aaaabbcdddddddde";
        // expected : a4b2c1d8e2
        System.out.println(compressedString(testString));

    }

    private static String compressedString(String testString) {
        int sum = 1;
        String outputString = "";
        for(int i=0; i<testString.toCharArray().length-1;i++){
            if(testString.charAt(i)==testString.charAt(i+1))
                sum++;
            else {
                outputString = outputString + testString.charAt(i) + sum;
                sum = 1;
            }
        }
        outputString=outputString+testString.charAt(testString.toCharArray().length-1)+sum;
        return outputString;
    }
}
