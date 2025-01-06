package com.example.algorithm.programmers.basic;

public class P12928_약수의_합 {

    public static void main(String[] args) {
        System.out.println(Solution.solution(12));
        System.out.println(Solution.solution(5));
    }

    class Solution {
        public static int solution(int n) {
            int answer = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    answer += i;
                }
            }

            return answer;
        }
    }
}
