package com.algo;

public class HourGlass {

    public static void main(String[] args) {

        int [][] inputArray = {
                        {1,2,3,4,5,6} ,
                        {2,1,1,1,1,1} ,
                        {3,1,1,1,1,1} ,
                        {4,1,1,1,1,1} ,
                        {5,1,1,1,1,1} ,
                        {6,1,1,1,1,1}
        };

        System.out.println(maximumSumHourGlass(inputArray));

    }

    private static int maximumSumHourGlass(int[][] inputArray) {
        int result = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<inputArray.length-2;i++){
            for(int j=0;j<inputArray.length-2;j++){
                int top = inputArray[i][j] + inputArray[i][j+1] + inputArray[i][j+2];
                int middle = inputArray[i+1][j+1];
                int bottom = inputArray[i+2][j] + inputArray[i+2][j+1] + inputArray[i+2][j+2];
                result = top + middle + bottom;
                maxSum = Math.max(result, maxSum);
            }
        }
        return maxSum;
    }


}
