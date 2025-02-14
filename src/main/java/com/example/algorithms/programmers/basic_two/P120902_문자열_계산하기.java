package com.example.algorithms.programmers.basic_two;

public class P120902_문자열_계산하기 {
    public static void main(String[] args) {
        System.out.println(Solution.solution("3 + 4"));
    }

    class Solution {
        public static int solution(String my_string) {
            String[] parts = my_string.split(" ");
            int answer = Integer.parseInt(parts[0]);

            for (int i = 1; i < parts.length; i += 2) {
                String operation = parts[i];
                int num = Integer.parseInt(parts[i + 1]);
                if (operation.equals("+")) {
                    answer += num;
                } else if (operation.equals("-")) {
                    answer -= num;
                }
            }

            return answer;
        }
    }
}
