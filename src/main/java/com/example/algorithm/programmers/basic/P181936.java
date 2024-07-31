package com.example.algorithm.programmers.basic;

/**
 * 공배수
 * 정수 number와 n, m이 주어집니다.
 * number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return
 */
public class P181936 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(60, 2, 3));
    }

    class Solution {
        public static int solution(int number, int n, int m) {
            return number % n == 0 && number % m == 0 ? 1 : 0;
        }
    }
}