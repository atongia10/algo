package com.algo.util;

public class GCD {

    public static int gcdOfTwoNumbers(int a, int b){
        if(b == 0){
            return a;
        } else {
            return gcdOfTwoNumbers(b,a%b);
        }
    }

}
