package com.example.algorithms.programmers.basic;

import java.util.Arrays;

public class P120817_배열의_평균값 {

    public static void main(String[] args) {
        System.out.println(Solution.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(Solution.solution(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99}));
    }

    class Solution {
        public static double solution(int[] numbers) {
            return (double) Arrays.stream(numbers).sum() / numbers.length;
        }
    }
}
