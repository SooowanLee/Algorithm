package com.example.algorithms.baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int temp = n / 4;

        final String STRING_LONG = "long ";
        final String STRING_INT = "int";

        for (int i = 0; i < temp; i++) {
            System.out.print(STRING_LONG);
        }
        System.out.println(STRING_INT);
    }
}
