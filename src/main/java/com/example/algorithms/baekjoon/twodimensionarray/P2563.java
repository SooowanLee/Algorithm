package com.example.algorithms.baekjoon.twodimensionarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2563 {
    public static void main(String[] args) throws IOException {
        /**
         * 색종이
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = 0; //겹치는 면적을 뺀 총면적
        int n = Integer.parseInt(br.readLine()); //색종이 갯수
        boolean[][] arr = new boolean[101][101]; //도화지 크기

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()); //색종이 위치
            int x = Integer.parseInt(st.nextToken()); //색종이 x축 시작
            int y = Integer.parseInt(st.nextToken()); //색종이 y축 시작

            for (int j = x; j < x + 10; j++) {        //색종이 그리기
                for (int k = y; k < y + 10; k++) {
                    if (!arr[j][k]) {                 //겹치는 부분 확인
                        arr[j][k] = true;             
                        total++;                      //겹치지 않으면 총면적에 더하기
                    }
                }
            }
        }
        System.out.println(total);
    }
}
