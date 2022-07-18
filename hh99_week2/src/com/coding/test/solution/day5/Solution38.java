package com.coding.test.solution.day5;

public class Solution38 {
    public static String solution(String s) {
        String[] strArr = s.split(" ");
        int min = Integer.parseInt(strArr[0]);
        int max = Integer.parseInt(strArr[0]);
        int n;
        for (String value : strArr) {
            n = Integer.parseInt(value);
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        return min +" "+ max;
    }
}
