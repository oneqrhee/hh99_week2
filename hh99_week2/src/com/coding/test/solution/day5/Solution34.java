package com.coding.test.solution.day5;

import java.util.HashSet;
import java.util.Set;

public class Solution34 {
    public static int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        return Math.min(nums.length / 2, set.size());
    }
}
