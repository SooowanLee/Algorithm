package com.example.algorithm.programmers.basic;

public class P181914_9로_나눈_나머지 {

    public static void main(String[] args) {
        System.out.println(Solution.solution("123"));
        System.out.println(Solution.solution("78720646226947352489"));
    }

    class Solution {
        public static int solution(String number) {
            int answer = 0;
            int sum = 0;

            for (char c : number.toCharArray()) {
                sum += c - '0';
            }

            answer = sum % 9;

            return answer;
        }
    }
}
