package com.example.algorithms.programmers.basic;

public class P181865_간단한_식_계산하기 {

    public static void main(String[] args) {
        System.out.println(Solution.solution("43 + 12"));
        System.out.println(Solution.solution("0 - 7777"));
        System.out.println(Solution.solution("40000 * 40000"));
    }

    class Solution {
        public static int solution(String binomial) {
            int answer = 0;
            String[] split = binomial.split(" ");

            int a = Integer.parseInt(split[0]);
            String ob = split[1];
            int b = Integer.parseInt(split[2]);

            switch (ob) {
                case "+":
                    answer = a + b;
                    break;
                case "-":
                    answer = a - b;
                    break;
                case "*":
                    answer = a * b;
            }

            return answer;
        }
    }
}
