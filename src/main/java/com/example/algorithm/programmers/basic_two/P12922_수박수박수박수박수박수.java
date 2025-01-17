package com.example.algorithm.programmers.basic_two;

public class P12922_수박수박수박수박수박수 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(3));
        System.out.println(Solution.solution(4));
    }

    class Solution {
        public static String solution(int n) {
            StringBuilder sb = new StringBuilder();
            String soo = "수";
            String park = "박";

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    sb.append(soo);
                } else {
                    sb.append(park);
                }
            }


            return sb.toString();
        }
    }
}
