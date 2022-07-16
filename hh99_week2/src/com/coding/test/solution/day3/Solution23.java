package com.coding.test.solution.day3;

import java.util.*;

public class Solution23 {
    public static String solution(String s, int n) {
        Map<Integer, Character> alpha = new HashMap<>();
        int idx = 1;
        for (char i = 'a'; i <= 'z'; i++) {
            alpha.put(idx, i);
            idx++;
        }
        int idx2 = 55;
        for (char j = 'A'; j <= 'Z'; j++) {
            alpha.put(idx2, j);
            idx2++;
        }
        List<String> ch = new ArrayList<>(Arrays.asList(s.split("")).subList(0, s.length()));
        StringBuilder result = new StringBuilder();
        for (String str : ch) {
            if (Objects.equals(str, " ")) {
                result.append(str);
            } else {
                int findKey = 0;
                for(Map.Entry<Integer, Character> entry : alpha.entrySet()){
                    if(entry.getValue().equals(str.charAt(0))){
                        findKey = entry.getKey();
                        break;
                    }
                }
                findKey += n;
                if((findKey>26 & findKey<55) || findKey>80){
                    findKey -= 26;
                    result.append(alpha.get(findKey));
                }else{
                    result.append(alpha.get(findKey));
                }
            }
        }
        return result.toString();
    }
}
