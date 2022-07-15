package com.coding.test;

import com.coding.test.solution.day2.*;
import java.util.Arrays;

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
        System.out.println("ex2) " + Solution11.solution(626331));
        System.out.println();
    }
}
