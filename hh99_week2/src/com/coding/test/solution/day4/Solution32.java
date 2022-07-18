package com.coding.test.solution.day4;

import java.util.*;

public class Solution32 {
    public static int[] solution(int N, int[] stages) {
        Map<Integer, Double> fail = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            int overCount = 0;
            int equalCount = 0;
            double failure;
            for (int stage : stages) {
                if (stage > i) {
                    overCount++;
                } else if (stage == i) {
                    equalCount++;
                }
            }
            if (overCount==0 & equalCount==0){
                failure = 0.0d;
            }else{
                failure = (double) equalCount/(overCount+equalCount);
            }
            fail.put(i, failure);
        }

        Double[] values = fail.values().toArray(new Double[0]);
        Arrays.sort(values, Collections.reverseOrder());
        LinkedHashSet<Double> valueSet = new LinkedHashSet<>(Arrays.asList(values));
        List<Integer> result = new ArrayList<>();
        for(Double value : valueSet) {
            for (int key : fail.keySet()) {
                if (fail.get(key).equals(value)){
                    result.add(key);
                }
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
