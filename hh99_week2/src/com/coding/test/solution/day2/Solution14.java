package com.coding.test.solution.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution14 {
    public static int solution(int[][] sizes) {
        List<int[]> list = new ArrayList<>(Arrays.asList(sizes));
        List<int[]> list2 = new ArrayList<>();
        for (int[] ints : list) {
            Arrays.sort(ints);
            list2.add(ints);
        }
        int max_x = list2.get(0)[0];
        int max_y = list2.get(0)[1];
        for (int[] ints : list2) {
            if (ints[0] > max_x) {
                max_x = ints[0];
            }
            if (ints[1] > max_y) {
                max_y = ints[1];
            }
        }
        return max_x * max_y;
    }
}
