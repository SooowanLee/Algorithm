package com.example.algorithm.baekjoon.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P10951 {
    public static void main(String[] args) throws IOException {
        /**
         * A + B - 4
         * 1. 두 정수는 공백으로 나뉘어 구분된다.
         * 2. 입력의 종료는 더이상 읽을 수 있는 데이터(EOF)가 없을 때 종료한다.
         */
        //Scanner 사용
        //int이외의 데이터가 들어오면 hasNextInt()가 false를 반환하면서 while문 종료
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a + b);
        }

        //BufferedReader + StringTokenizer사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str;

        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str, " "); //while문을 돌때마다 객체를 생성한다. 성능상 문제가 있을 수 있다.
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(a + b).append("\n");
        }
        System.out.println(sb);

        //BufferedReader + String.charAt()
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        String str;

        while ((str = br.readLine()) != null) {
            int a = str.charAt(0) - 48;
            int b = str.charAt(2) - 48;

            sb.append(a + b).append("\n");
        }
        System.out.println(sb);
    }
}
