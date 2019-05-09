
/*
* Given an array of integers, return indices of the two numbers such that they add up to a specific target.
* */

package com.algo;

import java.util.HashMap;
import java.util.Map;

public class SumOfSeries {


    public static void main(String[] args) {

        int inputArray[] = {4,1,2,3};
        int targetSum = 61;

        System.out.println("Two Sum Exists ? " + towSum(inputArray, targetSum));

    }

    private static boolean towSum(int[] inputArray, int targetSum) {
        boolean result = false;
        Map<Integer, Integer> tempHashMap = new HashMap<Integer, Integer>();

        for(int i=0;i<inputArray.length;i++){
            int compliment = targetSum - inputArray[i];
            if(tempHashMap.containsKey(compliment)){
                System.out.println("[ "+ i + " , " + tempHashMap.get(compliment) + " ]");
                System.out.println("[ "+ inputArray[i] + " , " + inputArray[tempHashMap.get(compliment)] + " ]");
                return true;
            } else {
                tempHashMap.put(inputArray[i],i);
            }
        }
        return false;
    }

}
