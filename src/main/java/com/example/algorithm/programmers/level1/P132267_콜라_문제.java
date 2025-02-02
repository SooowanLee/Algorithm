package com.example.algorithm.programmers.level1;

public class P132267_콜라_문제 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(2, 1, 20));
        System.out.println(Solution.solution(3, 1, 20));
    }

    class Solution {
        public static int solution(int a, int b, int n) {
            int answer = 0; // 총 콜라 병 수

            while (n >= a) {
                int getCola = (n / a) * b;
                int remainBottle = n % a;

                answer += getCola;
                n = getCola + remainBottle;
            }

            return answer;
        }
    }
}
