package com.example.algorithms.programmers.level2;

public class P12985_예상_대진표 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(8, 4, 7));
    }


    class Solution {
        public static int solution(int n, int a, int b) {
            int answer = 0;

            while (a != b) {
                a = (a + 1) / 2;
                b = (b + 1) / 2;
                answer++;
            }

            return answer;
        }
    }
}
