package com.example.algorithms.baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        final String TEXT = "Case #";
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            sb.append((TEXT + i) + ": " + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())))
                    .append("\n");
        }
        System.out.println(sb);
    }
}
