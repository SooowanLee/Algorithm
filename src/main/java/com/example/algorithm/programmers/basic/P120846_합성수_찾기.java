package com.example.algorithm.programmers.basic;

public class P120846_합성수_찾기 {

    public static void main(String[] args) {
        System.out.println(Solution.solution(10));
        System.out.println(Solution.solution(15));
    }

    class Solution {
        public static int solution(int n) {
            int answer = 0;

            for (int i = 1; i <= n; i++) {
                int count = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count >= 3) {
                    answer++;
                }
            }

            return answer;
        }
    }
}
