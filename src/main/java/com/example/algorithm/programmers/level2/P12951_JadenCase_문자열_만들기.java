package com.example.algorithm.programmers.level2;

public class P12951_JadenCase_문자열_만들기 {
    public static void main(String[] args) {
        System.out.println(Solution.solution("3people unFollowed me"));
        System.out.println(Solution.solution("for the last week"));
    }

    class Solution {
        public static String solution(String s) {
            String answer = "";
            String[] sp = s.toLowerCase().split("");
            boolean flag = true;

            for(String ss : sp) {
                answer += flag ? ss.toUpperCase() : ss;
                flag = ss.equals(" ") ? true : false;
            }

            return answer;
        }
    }
}
