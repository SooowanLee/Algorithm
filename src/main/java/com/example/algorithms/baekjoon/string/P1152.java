package com.example.algorithms.baekjoon.string;

import java.io.IOException;

public class P1152 {
    public static void main(String[] args) throws IOException {
        /**
         * 단어의 개수
         * 공백을 기준으로 단어를 세어라
         */

        //BufferedReader() + StringTokenizer()
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.println(st.countTokens());*/

        int count = 0;
        int pre_str = 32;
        int str;

        while (true) {
            str = System.in.read();
            if (str == 32) {
                if (pre_str != 32) {
                    count++;
                }
            } else if (str == 10) {
                if (pre_str != 32) {
                    count++;
                }
                break;
            }
            pre_str = str;
        }
        System.out.println(count);
    }
}
