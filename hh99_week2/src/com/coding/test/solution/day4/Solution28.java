package com.coding.test.solution.day4;

import java.util.Arrays;

public class Solution28 {
    public static int[] solution(int n, int m) {
        int[] t = {n, m};
        Arrays.sort(t);
        int maxValue = 0;
        for(int i=t[0]; i>0; i--){
            if(t[1]%i == 0 && t[0]%i == 0){
                maxValue = i;
                break;
            }
        }
        int minValue = 0;
        for(int j=t[1]; j<=n*m; j++){
            if(j%t[0]==0 && j%t[1]==0){
                minValue = j;
                break;
            }
        }
        return new int[]{maxValue, minValue};
    }
}