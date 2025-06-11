package com.example.algorithms.baekjoon.advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11399_ATM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());  // 사람 수
        int[] times = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            times[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(times);  // 작은 시간 먼저 처리 → 그리디 최적 전략 :contentReference[oaicite:1]{index=1}

        int sum = 0;   // 누적 대기 시간
        int total = 0; // 모든 사람의 총 대기 시간 합
        for (int t : times) {
            sum += t;
            total += sum;
        }

        System.out.println(total);
    }
}

