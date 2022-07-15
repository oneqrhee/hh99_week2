package com.coding.test.solution.day1;

import java.util.ArrayList;
import java.util.List;

public class Solution7 {
    public static int[] solution(long n) {
        List<Integer> list = new ArrayList<>();
        String str = String.valueOf(n);
        for (int i = str.length()-1; i>=0; i--){
            list.add(Character.getNumericValue(str.charAt(i)));
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
