package com.example.algorithm.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10807 {
    public static void main(String[] args) throws IOException {
        /**
         * 개수 세기
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int target = Integer.parseInt(br.readLine());
        int count = 0;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == target) {
                count++;
            }
        }
        System.out.println(count);
    }
}
