package com.coding.test;

import com.coding.test.solution.day2.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main_day2 {
    public static void main(String[] args) {
        System.out.println("Problem9.");
        System.out.println("ex1) " + Solution9.solution(121));
        System.out.println("ex2) " + Solution9.solution(3));
        System.out.println();

        System.out.println("Problem10.");
        System.out.println("ex1) " + Arrays.toString(Solution10.solution(new int[]{4, 3, 2, 1})));
        System.out.println("ex2) " + Arrays.toString(Solution10.solution(new int[]{10})));
        System.out.println();

        System.out.println("Problem11.");
        System.out.println("ex1) " + Solution11.solution(6));
        System.out.println("ex2) " + Solution11.solution(16));
        System.out.println("ex3) " + Solution11.solution(626331));
        System.out.println();

        System.out.println("Problem12.");
        System.out.println("ex1) " + Solution12.solution(10));
        System.out.println("ex2) " + Solution12.solution(12));
        System.out.println("ex3) " + Solution12.solution(11));
        System.out.println("ex4) " + Solution12.solution(13));
        System.out.println();

        System.out.println("Problem13.");
        System.out.println("ex1) " + Solution13.solution(45));
        System.out.println("ex2) " + Solution13.solution(125));
        System.out.println();

        System.out.println("Problem14.");
        System.out.println("ex1) " + Solution14.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
        System.out.println("ex2) " + Solution14.solution(new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}}));
        System.out.println("ex3) " + Solution14.solution(new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}}));
        System.out.println();

        System.out.println("Problem15.");
        System.out.println("ex1) " + Arrays.toString(Solution15.solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
        System.out.println("ex2) " + Arrays.toString(Solution15.solution(new int[]{4, 4, 4, 3, 3})));
        System.out.println();

        System.out.println("Problem16.");
        System.out.println("ex1) " + Arrays.toString(Solution16.solution(new int[]{2, 1, 3, 4, 1})));
        System.out.println("ex2) " + Arrays.toString(Solution16.solution(new int[]{5, 0, 2, 7})));
        System.out.println();
    }
}
