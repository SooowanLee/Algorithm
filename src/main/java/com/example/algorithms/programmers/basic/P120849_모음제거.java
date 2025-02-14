package com.example.algorithms.programmers.basic;

public class P120849_모음제거 {
    public static void main(String[] args) {
        System.out.println(Solution.solution("bus"));
        System.out.println(Solution.solution("nice to meet you"));
    }

    class Solution {
        public static String solution(String my_string) {
            StringBuilder answer = new StringBuilder();
            String aeiou = "aeiou";

            for (char c : my_string.toCharArray()) {
                if (aeiou.indexOf(c) == -1) {
                    answer.append(c);
                }
            }

            return answer.toString();
        }
    }
}
