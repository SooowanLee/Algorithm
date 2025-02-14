package com.example.algorithms.baekjoon.twodimensionarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10798 {
    public static void main(String[] args) throws IOException {
        /**
         * 세로읽기
         * A A B C D D
         * a f z z
         * 0 9 1 2 1
         * a 8 E W g 6
         * P 5 h 3 k x
         *
         * 위 글자를 세로로 읽는다 중간에 공백은 읽지 않는다.
         * Aa0aPAf985Bz1EhCz2W3D1gkD6x
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[][] str = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                str[i][j] = s.charAt(j);
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (str[j][i] != '\0') {
                    sb.append(str[j][i]);
                }
            }
        }
        System.out.println(sb);
    }
}
