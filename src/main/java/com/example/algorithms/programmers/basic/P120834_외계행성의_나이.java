package com.example.algorithms.programmers.basic;

public class P120834_외계행성의_나이 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(23));
        System.out.println(Solution.solution(51));
        System.out.println(Solution.solution(100));
    }


    class Solution {
        public static String solution(int age) {
            StringBuilder answer = new StringBuilder();
            String s = String.valueOf(age);

            /*for (int i = 0; i < s.length(); i++) {
                char digitChar = s.charAt(i); //문자 추출
                int digit = digitChar - '0'; //숫자로 변환
                char alienChar = (char) ('a' + digit);//문자로 변환
                answer.append(alienChar);
            }*/

            //향상된 for문 사용
            for (char c : s.toCharArray()) {
                answer.append((char) ('a' + (c - '0')));
            }

            return answer.toString();
        }
    }
}
