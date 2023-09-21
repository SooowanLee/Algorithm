package com.example.algorithm.baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P8393 {
    public static void main(String[] args) throws IOException {
        /**
         * N만큼의 합 구하기
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int s = 0;
        for (int i = 1; i <= n; i++) {
            s +=i;
        }
        System.out.println(s);

    }
}
