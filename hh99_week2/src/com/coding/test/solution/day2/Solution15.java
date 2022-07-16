package com.coding.test.solution.day2;

import java.util.*;
import java.util.stream.Collectors;

public class Solution15 {
    public static int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for(int i=1; i<arr.length; i++){
            if (arr[i-1] != arr[i]){
                list.add(arr[i]);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
