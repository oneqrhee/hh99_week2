package com.coding.test.solution.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Solution19 {
    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        List<String> list = new ArrayList<>();
        for (String string : strings) {
            list.add(string.split("")[n]);
        }

        List<String> newList = list.stream().distinct().collect(Collectors.toList()); //중복값 제거
        String[] arr = newList.toArray(new String[0]);
        Arrays.sort(arr);

        List<String> answer = new ArrayList<>();
        for (String s : arr) {
            for (String string : strings) {
                if (Objects.equals(string.split("")[n], s)) {
                    answer.add(string);
                }
            }
        }
        return answer.toArray(new String[0]);
    }
}
