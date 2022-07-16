package com.coding.test.solution.day3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution17 {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int zeroCount = 0;
        for (int lotto : lottos){
            if(lotto == 0){
                zeroCount += 1;
            }
        }
        List<Integer> lottosList = Arrays.stream(lottos).boxed().collect(Collectors.toList());
        List<Integer> winList = Arrays.stream(win_nums).boxed().collect(Collectors.toList());
        int rank = 0;
        lottosList.remove(Integer.valueOf(0));
        for (int lotto : lottosList){
            if (winList.contains(lotto)){
                rank += 1;
            }
        }
        int[] answer = new int[2];
        answer[0] = rank + zeroCount;
        answer[1] = rank;
        for (int i=0; i<answer.length; i++) {
            answer[i] = rankInvert(answer[i]);
        }
        return answer;
    }
    private static int rankInvert(int num) {
        if( num>=2 & num<=6 ){
            return 7-num;
        } else {
            return 6;
        }
    }
}
