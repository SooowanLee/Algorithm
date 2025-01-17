package com.example.algorithm.programmers.basic_two;

public class P120853_컨트롤_제트 {
    public static void main(String[] args) {
        System.out.println(Solution.solution("1 2 Z 3"));
        System.out.println(Solution.solution("10 20 30 40"));
        System.out.println(Solution.solution("10 Z 20 Z 1"));
        System.out.println(Solution.solution("10 Z 20 Z"));
        System.out.println(Solution.solution("-1 -2 -3 Z"));
    }

    /**
     * 현재 요소가 "Z"가 아니면 숫자로 변환하여 answer에 더합니다.
     * 그리고 현재 숫자를 저장하는 변수 prev에 현재 숫자를 저장합니다.
     * 현재 요소가 "Z"이면 prev에 저장된 이전 숫자를 answer에서 뺍니다.
     */
    class Solution {
        public static int solution(String s) {
            int answer = 0;
            int prev = 0;

            String[] parts = s.split(" ");

            for (String part : parts) {
                if (!part.equals("Z")) {
                    int num = Integer.parseInt(part);
                    answer += num;
                    prev = num;
                } else {
                    answer -= prev;
                }
            }

            return answer;
        }
    }
}
