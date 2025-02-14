package com.example.algorithms.programmers.basic;

/**
 * 점의 위치 구하기
 */
public class P120841 {

    public static void main(String[] args) {
        System.out.println(Solution.solution(new int[]{2, 4}));
        System.out.println(Solution.solution(new int[]{-7, 9}));
    }

    class Solution {
        public static int solution(int[] dot) {
            int answer = 0;

            if (dot[0] > 0 && dot[1] > 0) {
                return answer = 1;
            }
            if (dot[0] < 0 && dot[1] > 0) {
                return 2;
            }
            if (dot[0] < 0 && dot[1] < 0) {
                return 3;
            }
            if (dot[0] > 0 && dot[1] < 0) {
                return 4;
            }
            return answer;
        }
    }
}
