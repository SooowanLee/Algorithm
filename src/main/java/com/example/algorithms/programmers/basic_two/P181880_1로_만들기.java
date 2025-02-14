package com.example.algorithms.programmers.basic_two;

public class P181880_1로_만들기 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(new int[]{12, 4, 15, 1, 14}));
    }

    class Solution {
        public static int solution(int[] num_list) {
            int answer = 0;

            for (int num : num_list) {
                int j = num; //num_list의 각 원소에 대해 연산
                while (j > 1) { //j가 1보다 클 동안 반복
                    if (j % 2 == 0) {
                        j /= 2;
                    } else {
                        j = (j - 1) / 2;
                    }
                    answer++; //1이 되기 전 연산 횟수만 카운트
                }
            }

            return answer;
        }
    }
}
