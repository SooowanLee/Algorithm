package com.example.algorithms.baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11022 {
    public static void main(String[] args) throws IOException {
        /**
         * A+B-8
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int A = 0;
        int B = 0;

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            sb.append("Case #" + i + ": ").append(A + " + " + B + " = " + (A + B)).append("\n");
        }
        System.out.println(sb);
    }
}
