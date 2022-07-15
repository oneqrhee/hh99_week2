package com.coding.test.solution.day2;

import java.util.ArrayList;
import java.util.List;

public class Solution12 {
    public static boolean solution(int x) {
        String str = Integer.toString(x);
        List<Character> list = new ArrayList<>();
        int x_sum = 0;
        for(int i=0; i<str.length(); i++){
            list.add(str.charAt(i));
        }
        for (Character character : list) {
            x_sum += Character.getNumericValue(character);
        }
        return x % x_sum == 0;
    }
}
