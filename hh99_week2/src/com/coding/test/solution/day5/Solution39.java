package com.coding.test.solution.day5;

public class Solution39 {
    public static int solution(int n) {
        int count = 0;
        for(int j=1; j<=n; j++) {
            int sum = 0;
            for (int i=j ; i <= n; i++) {
                sum += i;
                if (sum == n) {
                    count++;
                    break;
                }
                if (sum > n) {
                    break;
                }
            }
        }
        return count;
    }
}
