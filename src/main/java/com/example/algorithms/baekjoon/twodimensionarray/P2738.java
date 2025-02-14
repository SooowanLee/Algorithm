package com.example.algorithms.baekjoon.twodimensionarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2738 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        /**
         * 행렬 덧셈
         * N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.
         */
        /*//행렬 A를 만들고 B를 더하면서 C를 생성
        //행렬 크기를 입력 받는다.
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        //행렬 생성
        int[][] arr = new int[N][M];
        
        //행렬 채우기(A)
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //행렬(A)와 행렬(B)를 더한 행렬을 담는다.
        StringBuilder sb = new StringBuilder();

        *//**
         * 행렬 채우기(B)
         * 행렬을 채우면서 행렬(A)와 더한다.
         *//*
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                sb.append(arr[i][j] + Integer.parseInt(st.nextToken()) + " ");
            }
            sb.append(System.lineSeparator());
        }
        System.out.println(sb);*/

        //행렬 A와 B를 미리 만들고 더하기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] A = new int[N][M];
        int[][] B = new int[N][M];

        createArr(br, N, M, A);
        createArr(br, N, M, B);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sb.append(A[i][j] + B[i][j] + " ");
            }
            sb.append(System.lineSeparator());
        }
        System.out.print(sb);
    }

    private static void createArr(BufferedReader br, int N, int M, int[][] arr) throws IOException {
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }
}
