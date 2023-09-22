package com.example.algorithm.baekjoon.array;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P10813 {
    public static void main(String[] args) throws IOException {
        /**
         * 공 바꾸기
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int M = Integer.parseInt(st.nextToken());
        int temp; //arr[i], arr[j]의 교환을 위한 임시바구니

        for (int i = 0; i < arr.length; i++) { //배열에 초기값 설정
            arr[i] = i + 1; //index는 0부터 시작하지만 바구니는 1부터 시작한다.
        }

        for (int j = 0; j < M; j++) {
            st = new StringTokenizer(br.readLine());

            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());

            temp = arr[I - 1];
            arr[I - 1] = arr[J - 1];
            arr[J - 1] = temp;
        }

        for (int k = 0; k < arr.length; k++) {
            bw.write(arr[k] + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
