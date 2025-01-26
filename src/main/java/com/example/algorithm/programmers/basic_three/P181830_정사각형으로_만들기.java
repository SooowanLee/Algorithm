package com.example.algorithm.programmers.basic_three;

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

            int newSize = Math.max(rowCount, columnCount);

            int[][] answer = new int[newSize][newSize];

            for (int i = 0; i < rowCount; i++) {
                System.arraycopy(arr[i], 0, answer[i], 0, columnCount);
            }

            return answer;
        }
    }
}
