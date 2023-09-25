package com.example.algorithm.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P27866 {
    public static void main(String[] args) throws IOException {
        /**
         * 문자와 문자열
         */
        //배열 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split("");
        int i = Integer.parseInt(br.readLine()) - 1;

        System.out.println(arr[i]);

        //charAt() 사용
        String s = br.readLine();
        System.out.println(s.charAt(i));
    }
}
