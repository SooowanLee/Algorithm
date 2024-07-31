package com.example.algorithm.programmers.basic;

/**
 * n의 배수
 * 정수 num과 n이 매개 변수로 주어질 때, num이 n의 배수이면 1을 return
 * n의 배수가 아니라면 0을 return
 */
public class P181937 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(98, 1));
    }

    class Solution {
        public static int solution(int num, int n) {
            return num % n == 0 ? 1 : 0;
        }
    }
}