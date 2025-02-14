package com.example.algorithms.programmers.basic_two;

public class P181917_간단한_논리_연산 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(false, true, true, true));
        System.out.println(Solution.solution(true, false, false, false));
    }

    class Solution {
        public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
            return (x1 || x2) && (x3 || x4);
        }
    }
}
