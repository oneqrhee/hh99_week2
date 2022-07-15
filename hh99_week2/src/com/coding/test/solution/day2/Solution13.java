package com.coding.test.solution.day2;

import java.util.ArrayList;
import java.util.List;

public class Solution13 {
    public static int solution(int n) {
        String str = Integer.toString(n, 3);
        List<Character> list = new ArrayList<>();
        for (int i=str.length()-1; i>=0; i--){
            list.add(str.charAt(i));
        }
        System.out.println(list);
        int sum = 0;
        for (int j=0; j<list.size(); j++) {
            int nn = Character.getNumericValue(list.get(j));
            sum += nn*Math.pow(3, list.size()-1-j);
        }
        return sum;
    }
}
