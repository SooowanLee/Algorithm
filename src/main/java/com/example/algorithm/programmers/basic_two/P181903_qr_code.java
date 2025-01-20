package com.example.algorithm.programmers.basic_two;

public class P181903_qr_code {
    public static void main(String[] args) {
        System.out.println(Solution.solution(3, 1, "qjnwezgrpirldywt"));
        System.out.println(Solution.solution(1, 0, "programmers"));
    }

    class Solution {
        public static String solution(int q, int r, String code) {
            StringBuilder sb = new StringBuilder();
            /*char[] charArray = code.toCharArray();

            for (int i = 0; i < charArray.length; i++) {
                if (i % q == r) {
                    sb.append(code.charAt(i));
                }
            }*/

            //start를 r로 하고 q만큼 인덱스를 이동
            for (int i = r; i < code.length(); i += q) {
                sb.append(code.charAt(i));
            }

            return sb.toString();
        }
    }
}
