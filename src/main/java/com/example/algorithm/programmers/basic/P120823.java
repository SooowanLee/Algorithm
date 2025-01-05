package com.example.algorithm.programmers.basic;

import java.util.Scanner;

/**
 * 직각삼각형 출력하기
 */
public class P120823 {
    public static void main(String[] args) {
        Solution.solution();
    }

    class Solution {
        public static void solution() {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

//            for (int i = 1; i <= n; i++) {
//                for (int j = 1; j <= i; j++) {
//                    System.out.print('*');
//                }
//                System.out.println();
//            }

            //자바11부터 지원하는 문자열 반복 함수
            for (int i = 1; i <= n; i++) {
                System.out.println("*".repeat(i));
            }
        }
    }
}
