package com.coding.test.solution.day5;

import java.util.ArrayList;
import java.util.List;

public class Solution35 {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        List<String> tempList1 = new ArrayList<>();
        List<String> tempList2 = new ArrayList<>();
        List<String> resultList = new ArrayList<>();
        convert(n, arr1, tempList1);
        convert(n, arr2, tempList2);

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if (tempList1.get(i).charAt(j) == '0' && tempList2.get(i).charAt(j) == '0'){
                    resultList.add(" ");
                } else{
                    resultList.add("#");
                }
            }
        }
        List<String> answer = new ArrayList<>();
        StringBuilder answerStr = new StringBuilder();
        int idx = 0;
        for (String s : resultList) {
            answerStr.append(s);
            idx++;
            if (idx == n) {
                answer.add(answerStr.toString());
                idx = 0;
                answerStr = new StringBuilder();
            }
        }
        return answer.toArray(new String[0]);
    }

    private static List<String> convert(int n, int[] arr, List<String> list) {
        for (int j : arr) {
            String str = Integer.toString(j, 2);
            StringBuilder tempStr = new StringBuilder();
            int l = str.length();
            while (l < n) {
                tempStr.append("0");
                l++;
            }
            tempStr.append(str);
            list.add(tempStr.toString());
        }
        return list;
    }
}
