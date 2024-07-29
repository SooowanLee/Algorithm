package com.example.algorithm.programmers.basic;

import java.util.Scanner;

/**
 * 같은 값인지 확인
 * 같은 값이면 1, 아니면 -1
 */
public class P120807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int j = sc.nextInt();

        System.out.println(Solution.print(i, j));

    }

    static class Solution {
        public static int print(int i, int j) {
            return i == j ? 1 : -1;
        }
    }
}
