package com.coding.test.solution.day1;

public class Solution6 {
    public static int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        String[] list = str.split("");
        for (String num : list){
            answer += Integer.parseInt(num);
        }
        return answer;
    }
}
