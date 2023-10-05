package com.example.algorithm.baekjoon.advanced1;

import java.io.*;

public class P10988 {
    public static void main(String[] args) throws IOException {
        /**
         * 팰린드롬 확인하기
         * level, noon과 같이 뒤집어도 똑같은 단어
         */
        
        //반복문 사용
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int ans = 1;

        for (int i = input.length() - 1; i >= 0; i--) {
            char c = input.charAt(i);

            if (c != input.charAt(input.length() - i - 1)) {
                ans = 0;
                break;
            }
        }

        bw.write(ans + "\n");
        bw.flush();
        bw.close();
        br.close();*/

        //StringBuilder
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());

        System.out.println(sb.toString().equals(sb.reverse().toString()) ? 1 : 0);


    }
}
