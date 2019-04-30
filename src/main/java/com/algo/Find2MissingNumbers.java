package com.algo;

public class Find2MissingNumbers {

    public static void main(String[] args) {
        int arr[] = {1,2,5,6,7,8,9};
        int n = 9;

        int sumTotal = n * (n+1)/2;
        int arrTotal = 0;
        for(int t:arr)
            arrTotal+=t;
        System.out.println(sumTotal+" : "+arrTotal);
        int pivot = (sumTotal - arrTotal)/2;


    }

}
