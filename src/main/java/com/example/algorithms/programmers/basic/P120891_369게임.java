package com.example.algorithms.programmers.basic;

public class P120891_369게임 {

    public static void main(String[] args) {
        System.out.println(Solution.solution(3));
        System.out.println(Solution.solution(29423));
    }

    class Solution {
        public static int solution(int order) {
            int answer = 0;
            String s = String.valueOf(order);

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (c == '3' || c == '6' || c == '9') {
                    answer++;
                }
            }

            return answer;
        }
    }

}
