package com.example.algorithm.programmers.level1;

import java.util.Arrays;

public class P42748_K번째수 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));
    }

    class Solution {
        public static int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];

            for (int i = 0; i < commands.length; i++) {
                int s = commands[i][0] - 1;
                int e = commands[i][1] - 1;
                int k = commands[i][2] - 1;

                // 1. 부분 배열 복사
                int[] subArray = Arrays.copyOfRange(array, s, e + 1);

                // 2. 복사된 배열 정렬
                Arrays.sort(subArray);

                // 3. k번째 숫자 선택
                answer[i] = subArray[k];
            }
            return answer;
        }
    }
}
