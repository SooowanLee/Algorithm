package com.example.algorithms.programmers.basic;

public class P12931_자릿수_더하기 {

    public static void main(String[] args) {
        System.out.println(Solution.solution(123));
        System.out.println(Solution.solution(987));
    }

    public class Solution {
        public static int solution(int n) {
            int answer = 0;
            char[] nChar = String.valueOf(n).toCharArray();

            for (int i = 0; i < nChar.length; i++) {
                answer += nChar[i] - '0';
            }

            return answer;
        }
    }
}
