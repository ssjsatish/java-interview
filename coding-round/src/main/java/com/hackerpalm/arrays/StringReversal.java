package com.hackerpalm.arrays;

public class StringReversal {

    public static String reverseString(String x){
        char[] chr = x.toCharArray();
        char[] rev = new char[chr.length];
        int j=0;
        for(int i=chr.length-1;i>=0;i--){
            rev[j++]=chr[i];
        }
        return new String(rev);
    }

    public static void main(String[] args) {
        String v = "SANJIBAN";
        System.out.println(StringReversal.reverseString(v));

    }
}
