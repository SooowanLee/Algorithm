package com.example.algorithm.baekjoon.advanced1;

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
        int[] requiredPieces = {1, 1, 2, 2, 2, 8};
        int[] playerPieces = new int[6];

        for (int i = 0; i < playerPieces.length; i++) {
            playerPieces[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 6; i++) {
            int difference = requiredPieces[i] - playerPieces[i];
            sb.append(difference).append(" ");
        }
        System.out.println(sb);
    }
}
