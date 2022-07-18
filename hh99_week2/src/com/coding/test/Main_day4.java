package com.coding.test;

import com.coding.test.solution.day3.Solution18;
import com.coding.test.solution.day4.*;

import java.util.Arrays;


public class Main_day4 {
    public static void main(String[] args){
        System.out.println("Problem25.");
        System.out.println("ex1) " + Solution25.solution(13, 17));
        System.out.println("ex2) " + Solution25.solution(24, 27));
        System.out.println();

        System.out.println("Problem26.");
        System.out.println("ex1) " + Solution26.solution(12));
        System.out.println("ex2) " + Solution26.solution(5));
        System.out.println();

        System.out.println("Problem27.");
        System.out.println("ex1) " + Solution27.solution(new int[]{1, 3, 2, 5, 4}, 9));
        System.out.println("ex2) " + Solution27.solution(new int[]{2, 2, 3, 3}, 10));
        System.out.println();

        System.out.println("Problem28.");
        System.out.println("ex1) " + Arrays.toString(Solution28.solution(3, 12)));
        System.out.println("ex2) " + Arrays.toString(Solution28.solution(2, 5)));
        System.out.println();

        System.out.println("Problem29.");
        System.out.println("ex1) " + Arrays.toString(Solution29.solution(new int[]{1, 5, 2, 6, 3, 7, 4},
                new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));
        System.out.println();

        System.out.println("Problem30.");
        System.out.println("ex1) " + Solution30.solution(10));
        System.out.println("ex2) " + Solution30.solution(12));
        System.out.println();

        System.out.println("Problem31.");
        System.out.println("ex1) " + Solution31.solution(10));
        System.out.println("ex2) " + Solution31.solution(5));
        System.out.println();

        System.out.println("Problem32.");
        System.out.println("ex1) " + Arrays.toString(Solution32.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3})));
        System.out.println("ex2) " + Arrays.toString(Solution32.solution(4, new int[]{4, 4, 4, 4, 4})));
        System.out.println();
    }
}
