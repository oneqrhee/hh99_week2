package com.coding.test.solution.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution18 {
    public static int[] solution(int[] answers) {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        List<int[]> list = new ArrayList<>();
        list.add(first);
        list.add(second);
        list.add(third);

        List<List<Integer>> answerList = new ArrayList<>();

        for (int[] ints : list) {
            makeAnswer(ints, answers, answerList);
        }

        List<Integer> scoreList = new ArrayList<>();
        for (List<Integer> integers : answerList) {
            scoring(integers, answers, scoreList);
        }

        int maxScore = scoreList.get(0);
        for (Integer integer : scoreList) {
            if (integer > maxScore) {
                maxScore = integer;
            }
        }

        List<Integer> answer = new ArrayList<>();
        for(int i=0; i<scoreList.size(); i++){
            if(scoreList.get(i) == maxScore){
                answer.add(i+1);
            }
        }
        int[] result = answer.stream().mapToInt(Number::intValue).toArray();
        Arrays.sort(result);
        return result;
    }

    private static List<List<Integer>> makeAnswer(int[] student, int[] answer, List<List<Integer>> answerList) {
        int count = 0;
        int idx = 0;
        List<Integer> list = new ArrayList<>();
        while (count < answer.length) {
            list.add(student[idx]);
            idx += 1;
            if (idx == student.length) {
                idx = 0;
            }
            count += 1;
        }
        answerList.add(list);
        return answerList;
    }

    private static List<Integer> scoring(List<Integer> answerList, int[] answer, List<Integer> scoreList){
        int score = 0;
        for(int i=0; i<answer.length; i++){
            if(answerList.get(i) == answer[i]){
                score += 1;
            }
        }
        scoreList.add(score);
        return scoreList;
    }
}
