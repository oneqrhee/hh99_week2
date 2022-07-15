package com.coding.test.solution.day2;

public class Solution9 {
    public static long solution(long n) {
        double a = Math.sqrt(n);
        String str = Double.toString(a);
        if (!str.split("\\.")[1].equals("0")){
            return -1;
        } else{
            double b = Math.pow(a+1, 2);
            return Double.valueOf(b).longValue();
        }
    }
}
