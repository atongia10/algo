package com.algo;

public class ReverseAStringInPlace {

    public static void main(String[] args) {
        String testString = "my name is anshul kumar tongia!";
        System.out.println("Reversed String is : "+reversedString(testString));
    }

    private static String reversedString(String testString) {

        StringBuffer sb = new StringBuffer(testString);

        int i = 0;
        int j = sb.length()-1;
        while(i<j){
            sb = swap(sb,i,j);
            i++;
            j--;
        }

        return sb.toString();
    }

    private static StringBuffer swap(StringBuffer sb, int i, int j) {
        char temp;
        temp = sb.charAt(i);
        sb.setCharAt(i,sb.charAt(j));
        sb.setCharAt(j,temp);
        return sb;
    }

}
