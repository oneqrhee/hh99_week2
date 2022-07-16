package com.coding.test.solution.day4;

import java.util.Arrays;

public class Solution27 {
    public static int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;
        int count = 0;
        for (int j : d) {
            answer += j;
            if (answer > budget) {
                break;
            }else{
                count++;
            }
        }
        return count;
    }
}
