package com.example.algorithm.programmers.basic;

/**
 * 가까운 1 찾기
 */
public class P181898 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(new int[]{0, 0, 0, 1}, 1));
        System.out.println(Solution.solution(new int[]{1, 0, 0, 1, 0, 0}, 4));
        System.out.println(Solution.solution(new int[]{1, 1, 1, 1, 0},3));
    }

    class Solution{
        public static int solution(int[] arr, int idx) {
            int answer = 0;

            for (int i = 0; i < arr.length; i++) {
                if (i >= idx && arr[i] == 1) {
                    answer = i;
                    return answer;
                }
            }

            return -1;
        }
    }
}
