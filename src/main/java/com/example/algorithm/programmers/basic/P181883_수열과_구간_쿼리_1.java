package com.example.algorithm.programmers.basic;

import java.util.Arrays;

public class P181883_수열과_구간_쿼리_1 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 1}, {1, 2}, {2, 3}})));
    }

    class Solution {

        /**
         * queries에서 시작과 끝 원소를 얻는다.
         * for문을 사용해서 arr의 s부터 e까지 돌면서 1씩 증가
         */
        public static int[] solution(int[] arr, int[][] queries) {
            for (int[] query : queries) {
                int s = query[0];
                int e = query[1];

                for (int i = s; i <= e; i++) {
                    arr[i]++;
                }
            }

            return arr;
        }
    }
}
