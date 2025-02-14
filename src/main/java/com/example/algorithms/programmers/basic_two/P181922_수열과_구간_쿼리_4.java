package com.example.algorithms.programmers.basic_two;

import java.util.Arrays;

public class P181922_수열과_구간_쿼리_4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(new int[]{0, 1, 2, 4, 3}, new int[][]{{0, 4, 1}, {0, 3, 2}, {0, 3, 3}})));
    }

    class Solution {
        public static int[] solution(int[] arr, int[][] queries) {
            for (int[] query : queries) {
                int s = query[0];
                int e = query[1];
                int k = query[2];

                for (int i = s; i <= e; i++) {
                    if (i % k == 0) {
                        arr[i]++; // k의 배수일 경우 값 증가
                    }
                }
            }

            return arr;
        }
    }
}
