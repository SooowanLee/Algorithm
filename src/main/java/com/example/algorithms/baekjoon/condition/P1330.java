package com.example.algorithms.baekjoon.condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        br.close();

//        if (A > B) {
//            System.out.println(">");
//        }
//        if (A < B) {
//            System.out.println("<");
//        }
//        if (A == B) {
//            System.out.println("==");
//        }

        /**
         * 삼항 연산자 사용
         */
        System.out.println((A > B) ? ">" : ((A < B ?  "<" : "==")));
    }
}
