package com.coding.test.solution.day5;

import java.util.*;
import java.util.stream.Collectors;

public class Solution33 {
    public static int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        List<Integer> lostList = Arrays.stream(lost).boxed().collect(Collectors.toList());
        List<Integer> reserveList = Arrays.stream(reserve).boxed().collect(Collectors.toList());

        for (int i = 0; i < lostList.size(); i++) {
            if (reserveList.contains(lostList.get(i))) {
                reserveList.remove(lostList.get(i));
                lostList.remove(i);
                i--;
            }
        }

        for (int i = 0; i < lostList.size(); i++) {
            if (reserveList.contains(lostList.get(i) - 1)) {
                reserveList.remove(Integer.valueOf(lostList.get(i) - 1));
                lostList.remove(i);
                i--;
            } else if (reserveList.contains(lostList.get(i) + 1)) {
                reserveList.remove(Integer.valueOf(lostList.get(i) + 1));
                lostList.remove(i);
                i--;
            }
        }
        return n - lostList.size();
    }
}
