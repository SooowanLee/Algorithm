package com.example.algorithm.programmers.basic;

/**
 * 두 수의 연산값 비교하기
 * 두 정수를 붙여서 쓴 값을 반환합니다.
 * 양의 정수 a 와 b가 주어졌을 때, a + b와 2*a*b 중 더 큰 값을 return
 */
public class P181938 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(2, 91));
    }

    class Solution {
        public static int solution(int a, int b) {
            int aLong = Integer.parseInt(String.valueOf(a) + b);
            int result_2ab = 2 * a * b;

            return Math.max(aLong, result_2ab);
        }
    }
}
