package com.example.algorithm.programmers.basic;

import java.util.Arrays;

public class P12954_x만큼_간격이_있는_n개의_숫자 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(2, 5)));
        System.out.println(Arrays.toString(Solution.solution(4, 3)));
        System.out.println(Arrays.toString(Solution.solution(-4, 2)));
    }

    class Solution {
        public static long[] solution(int x, int n) {
            long[] answer = new long[n];
            answer[0] = x;

            for (int i = 1; i < n; i++) {
//                answer[i] = (long) x * (i + 1);
                answer[i] = answer[i - 1] + x;
            }

            return answer;
        }
    }
}
