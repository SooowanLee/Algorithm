package com.example.algorithm.programmers.level1;

public class P82612_부족한_금액_계산하기 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(3, 20, 4));
    }

    class Solution {
        public static long solution(int price, int money, int count) {
            long total = 0;

            for (int i = 1; i <= count; i++) {
                total += (long) price * i; //총 비용 계산
            }

            return Math.max(total - money, 0);
        }
    }
}
