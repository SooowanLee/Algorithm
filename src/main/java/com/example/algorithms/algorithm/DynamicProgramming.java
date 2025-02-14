package com.example.algorithms.algorithm;

import java.util.HashMap;
import java.util.Map;

public class DynamicProgramming {
    public static void main(String[] args) {
        System.out.println(TopDown.fib(10));
        System.out.println(BottomUp.fib(10));
    }

    static class TopDown {
        static Map<Integer, Integer> memo = new HashMap<>();

        public static int fib(int n) {
            if(n <= 1) return n;
            if (memo.containsKey(n)) return memo.get(n);

            int result = fib(n - 1) + fib(n - 2);
            memo.put(n, result);

            return result;
        }
    }

    static class BottomUp {
        public static int fib(int n) {
            if (n <= 1) return n;

            int[] dp = new int[n + 1];
            dp[0] = 0;
            dp[1] = 1;

            for (int i = 2; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }

            return dp[n];
        }
    }
}
