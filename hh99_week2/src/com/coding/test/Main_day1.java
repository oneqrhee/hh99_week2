package com.coding.test;

import com.coding.test.solution.day1.*;
import java.util.Arrays;

public class Main_day1 {
    public static void main(String[] args) {
        System.out.println("Problem1.");
        System.out.println("ex1) " + Solution1.solution(5, 24));
        System.out.println();

        System.out.println("Problem2.");
        System.out.println("ex1) " + Arrays.toString(Solution2.solution(new int[]{5, 9, 7, 10}, 5)));
        System.out.println("ex2) " + Arrays.toString(Solution2.solution(new int[]{2, 36, 1, 3}, 1)));
        System.out.println("ex3) " + Arrays.toString(Solution2.solution(new int[]{3, 2, 6}, 10)));
        System.out.println();

        System.out.println("Problem3.");
        System.out.println("ex1) " + Solution3.solution(3));
        System.out.println("ex2) " + Solution3.solution(4));
        System.out.println();

        System.out.println("Problem4.");
        System.out.println("ex1) " + Solution4.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
        System.out.println("ex2) " + Solution4.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
                new String[]{"josipa", "filipa", "marina", "nikola"}));
        System.out.println("ex3) " + Solution4.solution(new String[]{"mislav", "stanko", "mislav", "ana"},
                new String[]{"stanko", "ana", "mislav"}));
        System.out.println();

        System.out.println("Problem5.");
        System.out.println("ex1) " + Solution5.solution("try hello world"));
        System.out.println();

        System.out.println("Problem6.");
        System.out.println("ex1) " + Solution6.solution(123));
        System.out.println("ex2) " + Solution6.solution(987));
        System.out.println();

        System.out.println("Problem7.");
        System.out.println("ex1) " + Arrays.toString(Solution7.solution(12345)));
        System.out.println();

        System.out.println("Problem8.");
        System.out.println("ex1) " + Solution8.solution(118372));
        System.out.println();
    }
}
