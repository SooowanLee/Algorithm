package com.example.algorithms.programmers.basic_two;

import java.util.Arrays;

public class P120890_가까운_수 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(new int[]{3, 10, 28}, 20));
        System.out.println(Solution.solution(new int[]{10, 11, 12}, 13));
    }

    class Solution {
        public static int solution(int[] array, int n) {
            int minDiff = Integer.MAX_VALUE; //최소 차이 초기화(최대 정수값으로)
            int answer = 0;

            Arrays.sort(array); //미리 정렬하여 같은 차이일 경우 작은 값을 선택하도록 함

            for (int num : array) {
                int diff = Math.abs(num - n); //차이의 절댓값 계산
                if (diff < minDiff) {
                    minDiff = diff;
                    answer = num;
                }
            }

            return answer;
        }
    }
}
