package com.example.algorithm.programmers.level2;

public class P12914_멀리_뛰기 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(4));
        System.out.println(Solution.solution(3));
    }

    class Solution {
        public static long solution(int n) {
            // 모듈러 상수
            final int MOD = 1234567;

            // n이 1이나 2인 경우 예외 처리
            if (n == 1) return 1;   // [1] 한 가지 방법
            if (n == 2) return 2;   // [1,1] 또는 [2] 두 가지 방법

            // dp 배열을 생성 (dp[i]는 i칸을 뛰어넘는 방법의 수)
            int[] dp = new int[n + 1];
            dp[1] = 1; // 1칸: [1]
            dp[2] = 2; // 2칸: [1,1]와 [2]

            // 3칸부터 n칸까지 점화식 적용
            for (int i = 3; i <= n; i++) {
                // 현재 칸까지 도달하는 방법 = 이전 칸(i-1)에서 1칸 점프 + (i-2)에서 2칸 점프
                dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
            }

            // n칸까지 도달하는 방법의 수 반환
            return dp[n];
        }
    }
}
