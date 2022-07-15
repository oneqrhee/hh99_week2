package com.coding.test.solution.day2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution10 {
    public static int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        } else {
            int min = arr[0];
            for (int j : arr) {
                if (j < min) {
                    min = j;
                }
            }
            List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
            list.remove(Integer.valueOf(min));
            return list.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}
