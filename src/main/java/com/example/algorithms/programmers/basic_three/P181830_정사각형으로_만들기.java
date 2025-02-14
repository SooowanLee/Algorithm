package com.example.algorithms.programmers.basic_three;

import java.util.Arrays;

public class P181830_정사각형으로_만들기 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(Solution.solution(new int[][]{{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}})));
        System.out.println(Arrays.deepToString(Solution.solution(new int[][]{{57, 192, 534, 2}, {9, 345, 192, 999}})));
        System.out.println(Arrays.deepToString(Solution.solution(new int[][]{{1, 2}, {3, 4}})));
    }

    class Solution {
        public static int[][] solution(int[][] arr) {
            int rowCount = arr.length;
            int columnCount = arr[0].length;

            // 행과 열 중 더 큰 값을 추출
            int newSize = Math.max(rowCount, columnCount);

            // 정사각형이기 때문에 행과 열의 값이 같다.
            int[][] answer = new int[newSize][newSize];

            // 행의 길이를 돌면서 열의 길이로 값을 초기화 그럼 정사각형이 완성된다.
            for (int i = 0; i < rowCount; i++) {
                System.arraycopy(arr[i], 0, answer[i], 0, columnCount);
            }

            return answer;
        }
    }
}
