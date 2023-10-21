package com.example.algorithm.baekjoon.generalmathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2745 {
    public static void main(String[] args) throws IOException {
        /**
         * 진법 변환
         * B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성하시오.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int tmp = 1;
        int sum = 0;

        for (int i = N.length() - 1; i >= 0; i--) {
            char C = N.charAt(i);

            if ('A' <= C && C <= 'Z') {
                sum += (C - 'A' + 10) * tmp;
            } else {
                sum += (C - '0') * tmp;
            }
            tmp *= B;
        }
        System.out.println(sum);
    }
}
