package com.example.algorithm.baekjoon.inputoutput;

import java.util.Scanner;

public class P10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(A + B);
        }

        System.out.println("====================");

        /**
         * 배열을 사용
         */
        int c = sc.nextInt(); //테스트 케이스의 개수

        int[] arr = new int[c]; //테스트 케이스 갯수만큼 공간을 확보

        for (int i = 0; i < c; i++) { //테스트 케이스 개수만큼 반복
            int A = sc.nextInt();
            int B = sc.nextInt();

            arr[i] = A + B; //배열에 0번째부터 순서대로 A + B 저장
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
