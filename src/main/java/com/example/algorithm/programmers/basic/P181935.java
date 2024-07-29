package com.example.algorithm.programmers.basic;

/**
 * n의 배수
 * 정수 num과 n이 매개 변수로 주어질 때, num이 n의 배수이면 1을 return
 * n의 배수가 아니라면 0을 return
 */
public class P181935 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(60, 2, 3));
    }

    class Solution {
        public static int solution(int number, int n, int m) {
            return number % n == 0 && number % m == 0 ? 1 : 0;
        }
    }
}
