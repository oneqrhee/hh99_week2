package com.coding.test.solution.day2;

public class Solution11 {
    public static int solution(int num) {
        long l = num;
        if (l == 1) {
            return 0;
        } else {
            int count = 0;
            while (l != 1) {
                if (l % 2 == 0) {
                    l /= 2;
                } else {
                    l = l * 3 + 1;
                }
                count += 1;
                if(count == 500){
                    return -1;
                }
            }
            return count;
        }
    }
}
