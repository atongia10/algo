package com.algo.dynamic;

import java.util.Arrays;

public class KnapSack01 {

    public static void main(String[] args) {
        int p[] =  {0,1,2,5,6};
        int wt[] = {0,2,3,4,5};
        int n = p.length;
        int m = 8;
        int k[][] = new int [n][m+1];

        for(int i=0;i<n;i++){
            for(int w=0;w<=m;w++){
                if(i==0 || w==0)
                    k[i][w]=0;
                else if (wt[i]<=w){
                 k[i][w] = max(p[i]+k[i-1][w-wt[i]],k[i-1][w]);
                } else {
                    k[i][w] = k[i-1][w];
                }
            }
        }
        System.out.println(Arrays.deepToString(k));

    }


    public static int max(int a, int b){
        if (a>=b) return a;
        else return b;
    }

}
