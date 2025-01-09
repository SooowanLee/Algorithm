package com.example.algorithm.programmers.basic_two;

public class P120910_세균_증식 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(2, 10));
        System.out.println(Solution.solution(7, 15));
    }

    class Solution {
        public static int solution(int n, int t) {
            //for문 사용
//            int bacteria = n; //초기 세균 수로 초기화
//
//            for (int i = 0; i < t; i++) {
//                bacteria *= 2; //매 시간마다 2배 증가
//            }
//
//            return bacteria;


            return n * (int) Math.pow(2, t);
        }
    }
}
