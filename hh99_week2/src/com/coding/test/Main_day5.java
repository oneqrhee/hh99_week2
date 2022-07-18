package com.coding.test;

import com.coding.test.solution.day5.*;

import java.util.Arrays;

public class Main_day5 {
    public static void main(String[] args){
        System.out.println("Problem33.");
        System.out.println("ex1) " + Solution33.solution(5, new int[]{2,4}, new int[]{1,3,5}));
        System.out.println("ex2) " + Solution33.solution(5, new int[]{2,4}, new int[]{3}));
        System.out.println("ex3) " + Solution33.solution(3, new int[]{3}, new int[]{1}));
        System.out.println();

        System.out.println("Problem34.");
        System.out.println("ex1) " + Solution34.solution(new int[]{3,1,2,3}));
        System.out.println("ex2) " + Solution34.solution(new int[]{3,3,3,2,2,4}));
        System.out.println("ex3) " + Solution34.solution(new int[]{3,3,3,2,2,2}));
        System.out.println();

        System.out.println("Problem35.");
        System.out.println("ex1) " + Arrays.toString(Solution35.solution(5, new int[]{9, 20, 28, 18, 11},
                new int[]{30, 1, 21, 17, 28})));
        System.out.println("ex2) " + Arrays.toString(Solution35.solution(6, new int[]{46, 33, 33, 22, 31, 50},
                new int[]{27, 56, 19, 14, 14, 10})));
        System.out.println();

        System.out.println("Problem36.");
        System.out.println("ex1) " + Solution36.solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right"));
        System.out.println("ex2) " + Solution36.solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left"));
        System.out.println("ex3) " + Solution36.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right"));
        System.out.println();

        System.out.println("Problem37.");
        System.out.println("ex1) " + Solution37.solution("1S2D*3T"));
        System.out.println("ex2) " + Solution37.solution("1D2S#10S"));
        System.out.println("ex3) " + Solution37.solution("1D2S0T"));
        System.out.println("ex4) " + Solution37.solution("1S*2T*3S"));
        System.out.println("ex5) " + Solution37.solution("1D#2S*3S"));
        System.out.println("ex6) " + Solution37.solution("1T2D3D#"));
        System.out.println("ex7) " + Solution37.solution("1D2S3T*"));
        System.out.println();

        System.out.println("Problem38.");
        System.out.println("ex1) " + Solution38.solution("1 2 3 4"));
        System.out.println("ex2) " + Solution38.solution("-1 -2 -3 -4"));
        System.out.println("ex3) " + Solution38.solution("-1 -1"));
        System.out.println();

        System.out.println("Problem39.");
        System.out.println("ex1) " + Solution39.solution(15));
        System.out.println();

        System.out.println("Problem40.");
        System.out.println("ex1) " + Solution40.solution(new int[][]{{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1},
                {4,2,4,4,2}, {3,5,1,3,1}}, new int[]{1,5,3,5,1,2,1,4}));
        System.out.println();
    }
}
