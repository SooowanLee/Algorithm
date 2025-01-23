package com.example.algorithm.programmers.basic_three;

public class P120868_삼각형의_완성조건_2 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(new int[]{1, 2}));
        System.out.println(Solution.solution(new int[]{3, 6}));
        System.out.println(Solution.solution(new int[]{11, 7}));
    }

    class Solution {
        public static int solution(int[] sides) {
            int a = sides[0];
            int b = sides[1];

            int min = Math.abs(a - b) + 1; // 나머지 한 변의 최소 길이
            int max = a + b - 1; // 나머지 한 변의 최대 길이

            if (min > max) { // 만들 수 없는 경우
                return 0;
            }

            return max - min + 1;   // 가능한 정수 개수
        }
    }
}
