package com.example.algorithm.programmers.basic;

import java.util.Arrays;

/**
 * 최댓값 만들기 2
 */
public class P120862 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(new int[]{1, 2, -3, 4, -5}));
        System.out.println(Solution.solution(new int[]{0, -31, 24, 10, 1, 9}));
        System.out.println(Solution.solution(new int[]{10, 20, 30, 5, 5, 20, 5}));
    }

    class Solution {
        public static int solution(int[] numbers) {
            int answer = 0;
            int max = 0 ;
            int minusMax = 0;

            Arrays.sort(numbers);

            max = numbers[numbers.length - 1] * numbers[numbers.length - 2];
            minusMax = numbers[0] * numbers[1];

            if (max > minusMax) {
                answer = max;
            } else {
                return minusMax;
            }


            return answer;
        }
    }
}
