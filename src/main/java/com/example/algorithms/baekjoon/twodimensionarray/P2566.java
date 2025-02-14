package com.example.algorithms.baekjoon.twodimensionarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2566 {
    public static void main(String[] args) throws IOException {
        /**
         * 행렬에서 최댓값을 찾고 행렬 출력
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[][] arr = new int[9][9];
        int x = 0, y = 0;
        int max = -1;

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    x = i + 1;
                    y = j + 1;
                }
            }
        }
        sb.append(max).append(System.lineSeparator()).append(x + " " + y);
        System.out.println(sb);
    }
}
