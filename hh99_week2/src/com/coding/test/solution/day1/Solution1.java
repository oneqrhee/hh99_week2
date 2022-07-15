package com.coding.test.solution.day1;

public class Solution1 {
    public static String solution(int a, int b) {
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] date = {31,29,31,30,31,30,31,31,30,31,30,31};
        int temp = 0;

        for(int i = 0; i < a-1; i++){
            temp += date[i];
        }
        temp += b - 1;

        return day[temp % 7];
    }
}
