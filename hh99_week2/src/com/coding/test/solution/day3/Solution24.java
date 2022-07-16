package com.coding.test.solution.day3;

import java.util.ArrayList;
import java.util.List;

public class Solution24 {
    public static String solution(String new_id) {
        new_id = new_id.toLowerCase();
        List<Character> result = new ArrayList<>();
        for (int i = 0; i < new_id.length(); i++) {
            result.add(new_id.charAt(i));
        }
        for (int j = 0; j < result.size(); j++) {
            Character ch = result.get(j);
            if (!(ch >= 'A' && ch <= 'Z') && !(ch >= 'a' && ch <= 'z') && !(ch >= '0' && ch <= '9')
                    && (ch != '-') && (ch != '_') && (ch != '.')) {
                result.remove(ch);
                j -= 1;
            }
        }
        for (int k = 0; k < result.size() - 1; k++) {
            if (result.get(k) == '.') {
                if (result.get(k + 1) == '.') {
                    result.remove(k);
                    k -= 1;
                }
            }
        }
        if (result.get(0) == '.') {
            result.remove(0);
        }
        if (!(result.size() == 0) && result.get(result.size() - 1) == '.') {
            result.remove(result.size() - 1);
        }
        if (result.size() == 0) {
            result.add('a');
        }
        if (result.size() >= 16) {
            result.subList(15, result.size()).clear();
        }
        if (result.get(result.size() - 1) == '.') {
            result.remove(result.size() - 1);
        }
        if (result.size() <= 2) {
            while (result.size() < 3) {
                result.add(result.get(result.size() - 1));
            }
        }
        StringBuilder answer = new StringBuilder();
        for (Character c : result) {
            answer.append(c);
        }
        return answer.toString();
    }
}
