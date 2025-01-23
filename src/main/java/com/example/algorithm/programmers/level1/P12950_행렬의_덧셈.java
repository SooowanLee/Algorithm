package com.example.algorithm.programmers.level1;

import java.util.Arrays;

public class P12950_행렬의_덧셈 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(Solution.solution(new int[][]{{1, 2}, {2, 3}}, new int[][]{{3, 4}, {5, 6}})));
        System.out.println(Arrays.deepToString(Solution.solution(new int[][]{{1}, {2}}, new int[][]{{3}, {4}})));
    }

    /**
     * 행렬을 돌아가면서 더해준다.
     */
    class Solution {
        public static int[][] solution(int[][] arr1, int[][] arr2) {
            int[][] answer = {};
            answer = arr1;

            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[i].length; j++) {
                    arr1[i][j] = arr1[i][j] + arr2[i][j];
                }
            }

            return answer;
        }
    }
}
