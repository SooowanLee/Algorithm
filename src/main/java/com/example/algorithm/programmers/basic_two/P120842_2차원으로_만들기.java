package com.example.algorithm.programmers.basic_two;

import java.util.Arrays;

public class P120842_2차원으로_만들기 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(Solution.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2)));
        System.out.println(Arrays.deepToString(Solution.solution(new int[]{100, 95, 2, 4, 5, 6, 18, 33, 948}, 3)));
    }

    class Solution {
        public static int[][] solution(int[] num_list, int n) {
            int rows = num_list.length / n; //행의 개수
            int[][] answer = new int[rows][n];

            int index = 0; //num_list의 현재 인덱스
            for (int i = 0; i < rows; i++) { //행 순회
                for (int j = 0; j < n; j++) { //열 순회
                    answer[i][j] = num_list[index++]; //num_list의 원소를 2차원 배열에 할당
                }
            }

            return answer;
        }
    }
}
