package com.example.algorithm.programmers.basic_two;

import java.math.BigInteger;

public class P181846_두_수의_합 {
    public static void main(String[] args) {
        System.out.println(Solution.solution("582", "734"));
        System.out.println(Solution.solution("18446744073709551615", "287346502836570928366"));
        System.out.println(Solution.solution("0", "0"));
    }

    class Solution {
        public static String solution(String a, String b) {
            String answer = "";
            BigInteger num1 = new BigInteger(a);
            BigInteger num2 = new BigInteger(b);

            BigInteger sum = num1.add(num2);

            answer = sum.toString();

            return answer;
        }
    }
}
