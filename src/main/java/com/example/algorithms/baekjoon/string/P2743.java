package com.example.algorithms.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2743 {
    public static void main(String[] args) throws IOException {
        /**
         * 단어 길이 재기
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        System.out.println(s.length());
        
        // 배열 사용
        String[] arr = s.split("");
        System.out.println(arr.length);
    }
}
