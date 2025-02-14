package com.example.algorithms.baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2438 {
    public static void main(String[] args) throws IOException {
        /**
         * 별찍기-1
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        //이중 for문
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            if (i != n) { //마지막 for문에 개행X
            sb.append(System.lineSeparator());
            }
        }
        System.out.println(sb);


        // StringBuilder + repeat()
        /*for (int i = 1; i <= n; i++) {
            sb.append("*".repeat(i)).append(System.lineSeparator());
        }

        System.out.println(sb);*/
    }
}
