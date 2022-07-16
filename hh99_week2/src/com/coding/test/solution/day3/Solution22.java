package com.coding.test.solution.day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution22 {
    public static int solution(String s) {
        Map<String, String> map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");

        List<String> list = new ArrayList<>();
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            temp += s.split("")[i];
            if (map.containsKey(temp) || map.containsValue(temp)) {
                list.add(temp);
                temp = "";
            }
        }

        StringBuilder result = new StringBuilder();
        for (String str : list){
            result.append(map.getOrDefault(str, str));
        }
        return Integer.parseInt(result.toString());
    }
}
