package com.algo;

public class Anagram {

    public static void main(String[] args) {
        String s1 = "abbc";
        String s2 = "babd";
        s1 = s1.toLowerCase();
        s2.toLowerCase();
        System.out.println("Is Anagram : " + isAnagram(s1,s2));

    }

    private static boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length()) return false;

        int [] letters = new int[1<<8];
        for(char s: s1.toCharArray())
            letters[s]++;
        for(char s : s2.toCharArray())
            letters[s]--;
        for(int i : letters){
            if(1!=0)
                return false;
        }

        return true;
    }
}
