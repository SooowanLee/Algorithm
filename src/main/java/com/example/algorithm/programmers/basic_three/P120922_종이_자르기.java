package com.example.algorithm.programmers.basic_three;

public class P120922_종이_자르기 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(2, 2));
        System.out.println(Solution.solution(2, 5));
        System.out.println(Solution.solution(1, 1));
    }

    class Solution {
        public static int solution(int M, int N) {
//            (M - 1) + (N - 1) * M;

            // M * N 으로 최종 조각을 만들고 원래 있던 1조각을 빼면 가위질 횟수가 나온다.
            return M * N - 1;
        }
    }
}
