package com.example.algorithm.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2562 {
    public static void main(String[] args) throws IOException {
        /**
         * 최댓값과 순서
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int SIZE = 9;
        int[] arr = new int[SIZE];

        int max = 0;
        int maxIndex = 0;

        for (int i = 0; i < SIZE; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i + 1;
            }
        }

        System.out.println(max);
        System.out.print(maxIndex);
    }
}
