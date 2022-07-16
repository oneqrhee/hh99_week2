package com.coding.test.solution.day3;

import java.util.ArrayList;
import java.util.List;

public class Solution21 {
    public static int solution(int[] nums) {
        List<Integer> sum = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    sum.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }
        int answer = 0;
        for (int num : sum) {
            int isPrime = 0;
            for (int i = 2; i < num/2; i++) {
                if (num % i == 0) {
                    isPrime = 1;
                    break;
                }
            }
            if (isPrime == 0){
                answer += 1;
            }
        }
        return answer;
    }
}
