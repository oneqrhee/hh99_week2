package com.coding.test.solution.day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution36 {
    public static String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        Map<Integer, double[]> coordination = new HashMap<>();
        coordination.put(0, new double[]{0,0});
        coordination.put(1, new double[]{-1,3});
        coordination.put(2, new double[]{0,3});
        coordination.put(3, new double[]{1,3});
        coordination.put(4, new double[]{-1,2});
        coordination.put(5, new double[]{0,2});
        coordination.put(6, new double[]{1,2});
        coordination.put(7, new double[]{-1,1});
        coordination.put(8, new double[]{0,1});
        coordination.put(9, new double[]{1,1});

        Map<String, double[]> handLocation = new HashMap<>();
        handLocation.put("left", new double[]{-1,0});
        handLocation.put("right", new double[]{1,0});
        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                handLocation.put("left", coordination.get(number));
                answer.append("L");
            } else if (number == 3 || number == 6 || number == 9){
                handLocation.put("right", coordination.get(number));
                answer.append("R");
            }else{
                double leftDistance = getDistance(handLocation.get("left"), coordination.get(number));
                double rightDistance = getDistance(handLocation.get("right"), coordination.get(number));
                if(leftDistance > rightDistance){
                    handLocation.put("right", coordination.get(number));
                    answer.append("R");
                }else if(leftDistance < rightDistance){
                    handLocation.put("left", coordination.get(number));
                    answer.append("L");
                }else{
                    if(Objects.equals(hand, "right")){
                        handLocation.put("right", coordination.get(number));
                        answer.append("R");
                    }else{
                        handLocation.put("left", coordination.get(number));
                        answer.append("L");
                    }
                }
            }
        }
        return answer.toString();
    }

    private static double getDistance(double[] n, double[] m){
        return Math.abs(n[0]-m[0]) + Math.abs(n[1]-m[1]);
    }
}
