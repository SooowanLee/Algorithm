package com.example.algorithm.programmers.basic;

public class P12937_짝수와_홀수 {

    public static void main(String[] args) {
        System.out.println(Solution.solution(3));
        System.out.println(Solution.solution(4));
    }

    class Solution {
        public static String solution(int num) {
            String answer = "Even";

            if (num % 2 != 0) {
                answer = "Odd";
            }

            return answer;
        }
    }
}
