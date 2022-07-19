package com.coding.test.solution.day5;

public class Solution37 {
    public static int solution(String dartResult) {
        String temp = dartResult.replaceAll("[^0-9]", " ");
        String temp2 = temp.replaceAll("\\s+", " ");
        String[] numResult = temp2.split(" ");
        String tempResult = dartResult.replaceAll("[0-9]", " ");
        String tempResult2 = tempResult.replaceAll("\\s+", " ");
        String tempResult3 = tempResult2.trim();
        String[] result = tempResult3.split(" ");

        int[] score = {0, 0, 0};
        for(int i=0; i<numResult.length; i++) {
            int n = Integer.parseInt(numResult[i]);
            char c = result[i].charAt(0);
            char d = ' ';
            if (result[i].length() == 2) {
                d = result[i].charAt(1);
            }
            if (c == 'S') {
                score[i] = n;
            } else if (c == 'D') {
                score[i] = n * n;
            } else {
                score[i] = n * n * n;
            }
            if (i==0 & d == '*'){
                score[i] = score[i]*2;
            }
            if (i!=0 & d=='*'){
                score[i-1] = score[i-1]*2;
                score[i] = score[i]*2;
            }
            if(d=='#'){
                score[i] = score[i]*-1;
            }
        }
        int answer = 0;
        for (int j : score) {
            answer += j;
        }
        return answer;
    }
}
