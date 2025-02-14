package com.example.algorithms.programmers.basic_two;

public class P120848_팩토리얼 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(3628800));
        System.out.println(Solution.solution(7));
    }

    class Solution {
        public static int solution(int n) {
            int i = 1;
            int factorial = 1;

            while (factorial <= n) {
                i++;
                factorial *= i; //i! 계산
            }

            return i -1; //n보다 커지는 순간의 i 값에서 1을 빼서 반환
        }
    }
}
