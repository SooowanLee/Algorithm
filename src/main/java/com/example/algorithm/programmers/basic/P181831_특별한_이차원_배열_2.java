package com.example.algorithm.programmers.basic;

public class P181831_특별한_이차원_배열_2 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(new int[][]{{5, 192, 33}, {192, 72, 95}, {33, 95, 999}}));
        System.out.println(Solution.solution(new int[][]{{19, 498, 258, 587}, {63, 93, 7, 754}, {258, 7, 1000, 723}, {587, 754, 723, 81}}));
    }

    class Solution {
        public static int solution(int[][] arr) {
            int answer = 0;

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j <= i; j++) {
                    if (arr[i][j] != arr[j][i]) {
                        return 0;
                    } else {
                        answer = 1;
                    }

                }
            }
            return answer;
        }
    }
}
