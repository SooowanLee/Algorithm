package com.example.algorithms.programmers.basic;

import java.util.Arrays;

public class P12944_평균_구하기 {

    public static void main(String[] args) {
        System.out.println(Solution.solution(new int[]{1, 2, 3, 4}));
        System.out.println(Solution.solution(new int[]{5, 5}));
    }

    class Solution {
        public static double solution(int[] arr) {
            return Arrays.stream(arr).average().getAsDouble();
        }
    }
}
