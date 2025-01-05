package com.example.algorithm.programmers.basic;

/**
 * 순서쌍의 개수
 */
public class P120836 {

    public static void main(String[] args) {
        System.out.println(Solution.solution(20));
        System.out.println(Solution.solution(100));
    }

    class Solution{
        public static int solution(int n){
            int count = 0;

            for (int i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    if (i * i == n) {
                        count++;
                    } else {
                        count += 2;
                    }
                }
            }

            return count;
        }
    }
}
