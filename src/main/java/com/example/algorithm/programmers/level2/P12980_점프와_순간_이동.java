package com.example.algorithm.programmers.level2;

public class P12980_점프와_순간_이동 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(5));
        System.out.println(Solution.solution(6));
        System.out.println(Solution.solution(5000));
    }


    public class Solution {
        public static int solution(int n) {
            int ans = 0;

            while (n > 0) {
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n--;
                    ans++;
                }
            }

            return ans;
        }
    }
}
