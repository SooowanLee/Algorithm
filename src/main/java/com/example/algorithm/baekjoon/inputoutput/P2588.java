package com.example.algorithm.baekjoon.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P2588 {
    public static void main(String[] args) throws IOException {
        /**
         * 곱셈
         * 하나로 입력된 문자(숫자)를 분리하여 연산을 할 수 있는지 확인하는 문제
         * 1. 문자열로 입력받아 charAt()으로 하나씩 꺼내 쓰는 방법
         * 2. 나머지와 나눗셈 연산을 통해 각 자릿수를 구하여 쓰는 방법
         */
        Scanner sc = new Scanner(System.in);

//        int A = sc.nextInt();
//        int B = sc.nextInt();

        //1. 첫 번째 방법
//        System.out.println(A * (B.charAt(2) - '0'));
//        System.out.println(A * (B.charAt(1) - '0'));
//        System.out.println(A * (B.charAt(0) - '0'));
//        System.out.println(A * Integer.parseInt(B));

        //2. 두 번째 방법
        /*System.out.println(A * (B % 10));
        System.out.println(A * (B % 100 / 10));
        System.out.println(A * (B / 100));
        System.out.println(A * B);*/

        //BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
//
//        StringBuilder sb = new StringBuilder();
//        sb.append(A * (B % 10));
//        sb.append('\n');
//
//        sb.append(A * (B % 100 / 10));
//        sb.append('\n');
//
//        sb.append(A * (B / 100));
//        sb.append('\n');
//
//        sb.append(A * B);
//
//        br.close();
//
//        System.out.println(sb);

        //3. 세 번째 방법 BufferedReader + charAt()
        String S = String.valueOf(B);

        for (int i = 2; i >= 0; i--) {
            System.out.println(A * (S.charAt(i) - '0'));
        }
        System.out.println(A * B);
    }
}
