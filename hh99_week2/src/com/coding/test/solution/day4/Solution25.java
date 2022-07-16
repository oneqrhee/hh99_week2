package com.coding.test.solution.day4;

public class Solution25 {
    public static int solution(int left, int right) {
        int result = 0;
        for(int i=left; i<=right; i++){

            if(divide(i)%2 == 0){
                result += i;
            }else{
                result -= i;
            }
        }
        return result;
    }
    private static int divide(int a){
        int count = 0;
        for (int i=1; i<=a; i++){
            if(a%i == 0){
                count += 1;
            }
        }
        return count;
    }
}
