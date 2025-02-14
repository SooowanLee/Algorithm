package com.example.algorithms.programmers.basic_two;

import java.util.Arrays;

public class P181924_수열과_구간_쿼리_3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 3}, {1, 2}, {1, 4}})));
    }

    class Solution {
        public static int[] solution(int[] arr, int[][] queries) {
            int[] answer = Arrays.copyOf(arr, arr.length);

   /*         //기본적인 for문
            for (int i = 0; i < queries.length; i++) {
                int s = queries[i][0];
                int e = queries[i][1];

                //값 교환
                int temp = answer[s];
                answer[s] = answer[e];
                answer[e] = temp;
            }*/

            //향상된 for문
            for (int[] query : queries) {
                int s2 = query[0];
                int e2 = query[1];

                //값 교환
                int temp2 = answer[s2];
                answer[s2] = answer[e2];
                answer[e2] = temp2;
            }

            return answer;
        }
    }
}
