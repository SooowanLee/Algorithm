package com.example.algorithms.programmers.level1;

public class P12918_문자열_다루기_기본 {
    public static void main(String[] args) {
        System.out.println(Solution.solution("a234"));
        System.out.println(Solution.solution("1234"));
    }

    class Solution {
        public static boolean solution(String s) {
            boolean answer = true;

            //정규 표현식
//            if (s.length() != 4 && s.length() != 6) {
//                return false;
//            }
//
//            return s.matches("[0-9]+");

            //Character.isDigit()
            if (s.length() != 4 && s.length() != 6) {
                return false;
            }

            for (int i = 0; i < s.length(); i++) {
                if (!Character.isDigit(s.charAt(i))) {
                    return false;
                }
            }

            return answer;
        }
    }
}