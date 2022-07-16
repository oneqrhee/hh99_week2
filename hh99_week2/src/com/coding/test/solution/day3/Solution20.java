package com.coding.test.solution.day3;

import java.util.*;

public class Solution20 {
    public static String solution(String s) {
        List<String> list = new ArrayList<>(Arrays.asList(s.split("")).subList(0, s.length()));
        List<String> listLower = new ArrayList<>();
        List<String> listUpper = new ArrayList<>();
        for(String str : list){
            if(str.compareTo("a")>=0){
                listLower.add(str);
            }else {
                listUpper.add(str);
            }
        }
        String[] strLower = listLower.toArray(new String[0]);
        String[] strUpper = listUpper.toArray(new String[0]);
        Arrays.sort(strLower, Comparator.reverseOrder());
        Arrays.sort(strUpper, Comparator.reverseOrder());

        List<String> result = new ArrayList<>(Arrays.asList(strLower));
        result.addAll(Arrays.asList(strUpper));

        StringBuilder answer = new StringBuilder();
        for (String value : result) {
            answer.append(value);
        }
        return answer.toString();
    }
}
