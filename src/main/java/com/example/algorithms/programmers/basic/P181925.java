package com.example.algorithms.programmers.basic;

/**
 * 수 조작하기 2
 */
public class P181925 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(new int[]{0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1}));
    }

    class Solution {
        public static String solution(int[] numLog) {
            StringBuilder sb = new StringBuilder();

            for (int i = 1; i < numLog.length; i++) {
                if (numLog[i] == numLog[i - 1] + 1) {
                    sb.append("w");
                }
                if (numLog[i] == numLog[i - 1] - 1) {
                    sb.append("s");
                }
                if (numLog[i] == numLog[i - 1] + 10) {
                    sb.append("d");
                }
                if (numLog[i] == numLog[i - 1] - 10) {
                    sb.append("a");
                }
            }
            return sb.toString();
        }
    }
}
