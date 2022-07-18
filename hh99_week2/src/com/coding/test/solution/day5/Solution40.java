package com.coding.test.solution.day5;

import java.util.Stack;

public class Solution40 {
    public static int solution(int[][] board, int[] moves) {
        Stack<Integer> result = new Stack<>();
        int n = board.length;
        int count = 0;
        for (int move : moves) {
            for (int j = 0; j < n; j++) {
                if (board[j][move - 1] != 0) {
                    if(!result.isEmpty() && result.peek() == board[j][move - 1]){
                        result.pop();
                        count += 2;
                    }else{
                        result.push(board[j][move - 1]);
                    }
                    board[j][move - 1] = 0;
                    break;
                }
            }
        }
        return count;
    }
}
