package com.example.algorithms.programmers.basic_three;

public class P120840_구슬을_나누는_경우의_수 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(3, 2));
        System.out.println(Solution.solution(5, 3));
    }

    class Solution {
        public static int solution(int balls, int share) {
            if (share == 0 || balls == share) {
                return 1;
            }

            return combination(balls, share);
        }

        private static int combination(int n, int r) {
            r = Math.min(r, n - r);
            long result = 1;
            for (int i = 0; i < r; i++) {
                result *= (n - i);
                result /= (i + 1);
            }

            return (int) result;
        }
    }
}
