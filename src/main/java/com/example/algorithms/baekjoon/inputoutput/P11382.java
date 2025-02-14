package com.example.algorithms.baekjoon.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine(), " ");

        long A = Long.parseLong(str.nextToken());
        long B = Long.parseLong(str.nextToken());
        long C = Long.parseLong(str.nextToken());


        System.out.println(A + B + C);
    }
}
