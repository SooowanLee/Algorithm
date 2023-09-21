package com.example.algorithm.baekjoon.array;

import java.io.IOException;
import java.util.Scanner;

public class P10871 {
    public static void main(String[] args) throws IOException {
        /**
         * X보다 작은 수
         */
        //Scanner() + 배열
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] seqArr = new int[N];

        for (int i = 0; i < seqArr.length; i++) {
            seqArr[i] = sc.nextInt();
        }

        for (int j = 0; j < seqArr.length; j++) {
            if (seqArr[j] < X) {
                System.out.print(seqArr[j] + " ");
            }
        }

        //Scanner() + StringBuilder()
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < N; i++) {
//            int value = sc.nextInt();
//            if (value < X) {
//                sb.append(value).append(" ");
//            }
//        }
//        System.out.println(sb);

        // BufferedReader() + StringTokenizer() + StringBuilder()
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//        int N = Integer.parseInt(st.nextToken());
//        int X = Integer.parseInt(st.nextToken());
//
//        StringBuilder sb = new StringBuilder();
//
//        st = new StringTokenizer(br.readLine(), " ");
//
//        for (int i = 0; i < N; i++) {
//            int value = Integer.parseInt(st.nextToken());
//
//            if (value < X) {
//                sb.append(value).append(" ");
//            }
//        }
//        System.out.println(sb);
    }
}
