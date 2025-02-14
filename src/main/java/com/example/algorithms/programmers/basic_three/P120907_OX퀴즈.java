package com.example.algorithms.programmers.basic_three;


import java.util.Arrays;

public class P120907_OX퀴즈 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(new String[]{"3 - 4 = -3", "5 + 6 = 11"})));
        System.out.println(Arrays.toString(Solution.solution(new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"})));
    }

    class Solution {
        public static String[] solution(String[] quiz) {
            String[] answer = new String[quiz.length];
            for (int i = 0; i < quiz.length; i++) {
                String[] split = quiz[i].split(" ");
                int s1 = Integer.parseInt(split[0]);
                String operation = split[1];
                int s2 = Integer.parseInt(split[2]);
                int s3 = Integer.parseInt(split[4]);
                int cal = 0;

                if (operation.equals("-")) {
                    cal = s1 - s2;
                } else {
                    cal = s1 + s2;
                }
                answer[i] = cal == s3 ? "O" : "X";
            }

            return answer;
        }
    }
}
