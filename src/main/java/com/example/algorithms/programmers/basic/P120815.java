package com.example.algorithms.programmers.basic;

/**
 * 피자 나눠 먹기(2)
 */
public class P120815 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(6));
        System.out.println(Solution.solution(10));
        System.out.println(Solution.solution(4));
    }

    //머쓱이네 피자가게는 피자가 6조각
    //모두가 동일하게 먹어야한다.
    class Solution {
        public static int solution(int n) {
            int pizza = 6;
            int count = 1;

            while ((pizza * count) % n != 0) {
                count++;
            }

            return count;
        }
    }
}
