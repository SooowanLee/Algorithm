package com.example.algorithm.programmers.basic;

public class P12934_정수_제곱근_판별 {

    public static void main(String[] args) {
        System.out.println(Solution.solution(121));
        System.out.println(Solution.solution(3));
    }

    class Solution {
        public static long solution(long n) {
            long answer = -1;
            long sqrt = (long) Math.sqrt(n);

            if (Math.pow(sqrt, 2) == n) {
                answer = (long) Math.pow((sqrt + 1), 2);
            }

            return answer;
        }
    }
}
