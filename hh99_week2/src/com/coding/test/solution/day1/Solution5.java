package com.coding.test.solution.day1;

public class Solution5 {
    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] list = s.split("");
        int idx = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(" ")) {
                idx = 0;
            } else if (idx % 2 == 0) {
                list[i] = list[i].toUpperCase();
                idx++;
            } else if (idx % 2 == 1) {
                list[i] = list[i].toLowerCase();
                idx++;
            }
            answer.append(list[i]);
        }
        return answer.toString();
    }
}
