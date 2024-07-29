package com.example.algorithm.programmers.basic;

/**
 * 더 크게 합치기
 * 두 정수를 붙여서 쓴 값을 반환합니다.
 * 12 + 3 = 123
 * 3 + 21 = 321
 * a + b와 b + a 중 더 큰 값을 반환합니다.
 */
public class P181939 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(10, 9));
    }

    class Solution {
        public static int solution(int a, int b) {

            int aLong = Integer.parseInt(String.valueOf(a) + b);
            int bLong = Integer.parseInt(String.valueOf(b) + a);

            return aLong > bLong ? aLong : bLong;
        }
    }
}
