package com.example.algorithms.baekjoon.advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11047_동전_0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 동전 종류
        int K = Integer.parseInt(st.nextToken()); // 목표 금액

        int[] coin = new int[N];
        for (int i = 0; i < N; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        // 그리디 계산
        int cnt = 0;
        for (int i = N - 1; i >= 0 && K > 0; i--) { // 큰값부터 사용
            if (coin[i] > K) continue;
            cnt += K / coin[i]; // 사용할 동전 개수
            K %= coin[i];       // 남은 금액
        }

        System.out.println(cnt);
    }
}
