package com.example.algorithms.programmers.basic;

public class P12912_두_정수_사이의_합 {

    public static void main(String[] args) {
        System.out.println(Solution.solution(3, 5));
        System.out.println(Solution.solution(3, 3));
        System.out.println(Solution.solution(5, 3));
    }

    class Solution {
        public static long solution(int a, int b) {
            long answer = 0;

            if (a > b) {
                for (int i = b; i <= a; i++) {
                    answer += i;
                }
            } else {
                for (int i = a; i <= b; i++) {
                    answer += i;

                }
            }

            return answer;
        }
    }
}
