package com.example.algorithms.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9086 {
    public static void main(String[] args) throws IOException {
        /**
         * 문자열
         * 문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //charAt() + StringBuilder()
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            sb.append(s.charAt(0));
            sb.append(s.charAt(s.length() - 1)).append(System.lineSeparator());
        }

        System.out.println(sb);



        //subString() 사용 + StringBuilder
       /* int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        //값을 할당
        for (int i = 0; i < arr.length; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < 1) {
                sb.append(arr[i] + "" + arr[i]);
            } else {
                sb.append(arr[i].substring(0, 1));
                sb.append((arr[i].substring(arr[i].length() -1, arr[i].length()))).append(System.lineSeparator());
            }
        }
        System.out.print(sb);*/
    }
}
