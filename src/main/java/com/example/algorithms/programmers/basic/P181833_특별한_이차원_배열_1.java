package com.example.algorithms.programmers.basic;

import java.util.Arrays;

public class P181833_특별한_이차원_배열_1 {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(Solution.solution(3)));
        System.out.println(Arrays.deepToString(Solution.solution(6)));
        System.out.println(Arrays.deepToString(Solution.solution(1)));
    }

    class Solution {
        public static int[][] solution(int n) {
            int[][] answer = new int[n][n];

            //이중 for문을 사용한 풀이
          /*  for (int i = 0; i < answer.length; i++) {
                for (int j = 0; j < answer[i].length; j++) {
                    if (i == j) {
                        answer[i][j] = 1;
                    }
                }
            }*/

            //더 좋은 성능의 for문 한 번 사용한 풀이
            for (int i = 0; i < n; i++) {
                answer[i][i] = 1;
            }

            return answer;
        }
    }
}
