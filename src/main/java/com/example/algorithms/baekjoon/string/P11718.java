package com.example.algorithms.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11718 {
    public static void main(String[] args) throws IOException {
        /**
         * 그대로 출력하기
         * 입력 받은 대로 출력하기
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();
            if (str == null || str.isEmpty()) break;
            sb.append(str).append(System.lineSeparator());
        }

        System.out.print(sb);
    }
}
