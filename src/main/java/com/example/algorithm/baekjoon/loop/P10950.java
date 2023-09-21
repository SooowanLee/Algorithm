package com.example.algorithm.baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10950 {
    public static void main(String[] args) throws IOException {
        /**
         * T만큼 개수 받아서 더하기
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))
                    .append("\n");
        }

        System.out.println(sb);
    }
}
