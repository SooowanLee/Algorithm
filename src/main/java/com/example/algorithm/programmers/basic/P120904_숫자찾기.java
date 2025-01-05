package com.example.algorithm.programmers.basic;

public class P120904_숫자찾기 {

    public static void main(String[] args) {
        System.out.println(Solution.solution(29183, 1));
        System.out.println(Solution.solution(232443, 4));
        System.out.println(Solution.solution(123456, 7));
    }

    class Solution {
        public static int solution(int num, int k) {
            int answer = 0;

            String s = String.valueOf(num);
            String c = String.valueOf(k);

            if (s.indexOf(c) == -1) {
                answer = -1;
            } else {
                answer = s.indexOf(c) + 1;
            }

            return answer;
        }
    }
}
