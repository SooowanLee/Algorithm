package com.example.algorithms.programmers.basic;

/**
 * 암호 해독
 */
public class P120892 {

    public static void main(String[] args) {
        System.out.println(Solution.solution("dfjardstddetckdaccccdegk", 4));
        System.out.println(Solution.solution("pfqallllabwaoclk", 2));
    }

    class Solution {
        public static String solution(String cipher, int code) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i <= cipher.length(); i++) {
                if (i % code == 0 && i >= code) {
                    sb.append(cipher.charAt(i - 1));
                }
            }

            return sb.toString();
        }
    }
}
