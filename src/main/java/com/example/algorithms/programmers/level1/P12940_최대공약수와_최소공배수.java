package com.example.algorithms.programmers.level1;

import java.util.Arrays;

public class P12940_최대공약수와_최소공배수 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(3, 12)));
        System.out.println(Arrays.toString(Solution.solution(2, 5)));
    }

    class Solution {
        public static int[] solution(int n, int m) {
            int[] answer = new int[2];

            for (int i = 1; i < Math.max(n, m); i++) {
                if (m % i == 0 && n % i == 0) {
                    answer[0] = i;
                    answer[1] = (n * m) / answer[0];
                }
            }

            return answer;
        }
    }
}
