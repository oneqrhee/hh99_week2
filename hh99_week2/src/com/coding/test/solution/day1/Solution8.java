package com.coding.test.solution.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution8 {
    public static long solution(long n) {
        List<Character> list = new ArrayList<>();
        String n_toString = String.valueOf(n);
        for (int i=0; i<n_toString.length(); i++){
            list.add(n_toString.charAt(i));
        }
        list.sort(Collections.reverseOrder());
        StringBuilder str = new StringBuilder();
        for (Character character : list) {
            str.append(character);
        }
        return Long.parseLong(str.toString());
    }
}
