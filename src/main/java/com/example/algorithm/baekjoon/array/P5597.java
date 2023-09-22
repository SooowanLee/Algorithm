package com.example.algorithm.baekjoon.array;

import java.io.*;
import java.util.Arrays;

public class P5597 {
    public static void main(String[] args) throws IOException {
        /**
         * 과제 안 내신 분..?
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] students = new boolean[31];

        for (int i = 0; i < 28; i++) {
            int checkedStudent = Integer.parseInt(br.readLine());

            students[checkedStudent] = true;
        }

        for (int i = 1; i < students.length; i++) {
            if (!students[i]) {
                System.out.println(i);
            }
        }
    }
}
