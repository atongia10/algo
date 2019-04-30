package com.algo;

public class XORTest {


    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,7,8,9};
        int xorTotal=0;
        int argTotal = 0;
        for(int i=1;i<=arr.length+1;i++)
            xorTotal ^=i;
        for(int i : arr)
            argTotal^=i;

        System.out.println(xorTotal^argTotal);
        System.out.println(5^16);


    }
}
