package com.coding.test.solution.day1;

import java.util.ArrayList;
import java.util.List;

public class Solution7 {
    public static int[] solution(long n) {
        List<Integer> temp_answer = new ArrayList<>();
        int[] answer;
        String str = String.valueOf(n);
        for (int i = str.length()-1; i>=0; i--){
            temp_answer.add(Character.getNumericValue(str.charAt(i)));
        }
        answer = new int[str.length()];
        for(int i=0; i<str.length(); i++){
            answer[i] = temp_answer.get(i);
        }
        return answer;
    }
}
