package com.example.algorithms.baekjoon.advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P3003 {
    public static void main(String[] args) throws IOException {
        /**
         * 킹, 퀸, 룩, 비숍, 나이트, 폰
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int[] original = {1, 1, 2, 2, 2, 8};
        int[] current = new int[6];

        for (int i = 0; i < current.length; i++) {
            current[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < 6; i++) {
            int different = original[i]- current[i];
            sb.append(different).append(" ");
        }

        System.out.print(sb);
    }
}
