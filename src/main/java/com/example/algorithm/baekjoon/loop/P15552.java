package com.example.algorithm.baekjoon.loop;

import java.io.*;
import java.util.StringTokenizer;

public class P15552 {
    public static void main(String[] args) throws IOException {
        /**
         * 빠른 A+B
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append("\n");
        }

        System.out.println(sb);
    }
}
