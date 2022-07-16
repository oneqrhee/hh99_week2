package com.coding.test;

import com.coding.test.solution.day3.*;

import java.util.Arrays;

public class Main_day3 {
    public static void main(String[] args) {
        System.out.println("Problem17.");
        System.out.println("ex1) " + Arrays.toString(Solution17.solution(new int[]{44, 1, 0, 0, 31, 25},
                new int[]{31, 10, 45, 1, 6, 19})));
        System.out.println("ex2) " + Arrays.toString(Solution17.solution(new int[]{0, 0, 0, 0, 0, 0},
                new int[]{38, 19, 20, 40, 15, 25})));
        System.out.println("ex3) " + Arrays.toString(Solution17.solution(new int[]{45, 4, 35, 20, 3, 9},
                new int[]{20, 9, 3, 45, 4, 35})));
        System.out.println();
    }
}
