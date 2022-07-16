package com.coding.test.solution.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution29 {
    public static int[] solution(int[] array, int[][] commands) {
        List<Integer> result = new ArrayList<>();
        for (int[] command : commands) {
            List<Integer> tempList = new ArrayList<>();
            for (int i = command[0] - 1; i < command[1]; i++) {
                tempList.add(array[i]);
            }
            int[] temp = tempList.stream().mapToInt(Integer::intValue).toArray();
            Arrays.sort(temp);
            result.add(temp[command[2]-1]);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
