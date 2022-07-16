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

        System.out.println("Problem18.");
        System.out.println("ex1) " + Arrays.toString(Solution18.solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println("ex2) " + Arrays.toString(Solution18.solution(new int[]{1, 3, 2, 4, 2})));
        System.out.println();

        System.out.println("Problem19.");
        System.out.println("ex1) " + Arrays.toString(Solution19.solution(new String[]{"sun", "bed", "car"}, 1)));
        System.out.println("ex2) " + Arrays.toString(Solution19.solution(new String[]{"abce","abcd", "cdx"}, 2)));
        System.out.println();

        System.out.println("Problem20.");
        System.out.println("ex1) " + Solution20.solution("Zbcdefg"));
        System.out.println();

        System.out.println("Problem21.");
        System.out.println("ex1) " + Solution21.solution(new int[]{1, 2, 3, 4}));
        System.out.println("ex2) " + Solution21.solution(new int[]{1, 2, 7, 6, 4}));
        System.out.println();

        System.out.println("Problem22.");
        System.out.println("ex1) " + Solution22.solution("one4seveneight"));
        System.out.println("ex2) " + Solution22.solution("23four5six7"));
        System.out.println("ex3) " + Solution22.solution("2three45sixseven"));
        System.out.println("ex4) " + Solution22.solution("123"));
        System.out.println();

        System.out.println("Problem23.");
        System.out.println("ex1) " + Solution23.solution("AB", 1));
        System.out.println("ex2) " + Solution23.solution("z", 1));
        System.out.println("ex3) " + Solution23.solution("a B z", 4));
        System.out.println();

        System.out.println("Problem24.");
        System.out.println("ex1) " + Solution24.solution("...!@BaT#*..y.abcdefghijklm"));
        System.out.println("ex2) " + Solution24.solution("z-+.^."));
        System.out.println("ex3) " + Solution24.solution("=.="));
        System.out.println("ex4) " + Solution24.solution("123_.def"));
        System.out.println("ex5) " + Solution24.solution("abcdefghijklmn.p"));
        System.out.println();
    }
}
