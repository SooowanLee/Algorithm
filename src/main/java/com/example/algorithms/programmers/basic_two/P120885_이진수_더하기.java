package com.example.algorithms.programmers.basic_two;

public class P120885_이진수_더하기 {
    public static void main(String[] args) {
        System.out.println(Solution.solution("10", "11"));
        System.out.println(Solution.solution("1001", "1111"));
    }

    class Solution {
        public static String solution(String bin1, String bin2) {
            String answer = "";

            int num1 = Integer.parseInt(bin1, 2); //bin1을 2진수에서 10진수로 변환
            int num2 = Integer.parseInt(bin2, 2); //bin2를 2진수에서 10진수로 변환

            int sum = num1 + num2;  //10진수 덧셈

            return Integer.toBinaryString(sum); //합을 10진수에서 2진수 문자열로 변환
        }
    }
}
