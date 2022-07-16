package com.coding.test.solution.day4;

public class Solution31 {
    public static int solution(int n) {
        if (n == 2) {
            return 1;
        } else if (n == 3) {
            return 2;
        } else {
            int count = 2;
            for (int i = 4; i <= n; i++) {
                int isPrime = 0;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = 1;
                        break;
                    }
                }
                if (isPrime == 0) {
                    count++;
                }
            }
            return count;
        }
    }
}
