package com.example.algorithms.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1654_랜선_자르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken()); // 기존 랜선 개수 K
        int N = Integer.parseInt(st.nextToken()); // 필요한 랜선 개수 N

        long[] arr = new long[K];
        for (int i = 0; i < K; i++) {
            arr[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(arr); // 최대값을 빠르게 구하기 위한 정렬 :contentReference[oaicite:1]{index=1}

        long left = 1;
        long right = arr[K - 1]; // 최댓값
        long result = 0;

        while (left <= right) {
            long mid = (left + right) / 2;

            long count = 0;
            for (long len : arr) {
                count += len / mid;
            }

            if (count >= N) {
                result = mid;   // 가능한 길이라면, 결과 갱신
                left = mid + 1; // 더 긴 길이가 가능한지 확인
            } else {
                right = mid - 1;
            }
        }

        System.out.println(result);
    }
}
