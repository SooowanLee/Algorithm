package com.example.algorithm.baekjoon.loop;

import java.io.*;

public class P2439 {
    public static void main(String[] args) throws IOException {
        /**
         * 별찍기-2
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        //BufferedWriter() + StringBuilder()
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n - i; j++) {
//                sb.append(" ");
//            }
//            for (int k = 1; k <= i; k++) {
//                sb.append("*");
//            }
//            sb.append(System.lineSeparator());
//        }
//
//        bw.write(sb.toString());
//        bw.flush();

        //BufferedWriter()
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                bw.write(" ");
            }
            for (int k = 1; k <= i; k++) {
                bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();
    }
}
