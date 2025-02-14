package com.example.algorithms.programmers.basic_two;

import java.util.Arrays;

public class P120889_삼각형의_완성조건_1 {

    public static void main(String[] args) {
        System.out.println(Solution.solution(new int[]{1, 2, 3}));
        System.out.println(Solution.solution(new int[]{3, 6, 2}));
        System.out.println(Solution.solution(new int[]{199, 72, 222}));
    }

    class Solution {
        public static int solution(int[] sides) {
            int answer = 2;

            Arrays.sort(sides);
            if (sides[0] + sides[1] > sides[2]) {
                return 1;
            }

            return answer;
        }
    }
}
