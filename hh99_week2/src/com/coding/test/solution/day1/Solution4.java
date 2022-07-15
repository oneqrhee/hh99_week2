package com.coding.test.solution.day1;
import java.util.Arrays;

public class Solution4 {
    public static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        int count = 0;
        for (int i = 0; i < completion.length; i++) {
            if (completion[i].equals(participant[i])) {
                count += 1;
            }else {
                break;
            }
        }
        return(participant[count]);
    }
}
