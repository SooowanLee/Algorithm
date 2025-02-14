package com.example.algorithms.programmers.level2;

import java.util.Arrays;

public class P12949_행렬의_곱셈 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(Solution.solution(new int[][]{{1, 4}, {3, 2}, {4, 1}}, new int[][]{{3, 3}, {3, 3}})));
        System.out.println(Arrays.deepToString(Solution.solution(new int[][]{{2, 3, 2}, {4, 2, 4}, {3, 1, 4}}, new int[][]{{5, 4, 3}, {2, 4, 1}, {3, 1, 1}})));
    }

    class Solution {
        public static int[][] solution(int[][] arr1, int[][] arr2) {
            int row = arr1.length; // 결과 행렬의 행 개수
            int col = arr2[0].length; // 결과 행렬의 열 개수
            int common = arr1[0].length; // 곱셈 연산을 수행할 공통 차원

            int[][] answer = new int[row][col];

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    for (int k = 0; k < common; k++) {
                        answer[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }

            return answer;
        }
    }
}
