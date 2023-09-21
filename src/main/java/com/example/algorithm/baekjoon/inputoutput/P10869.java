package com.example.algorithm.baekjoon.inputoutput;

import java.io.*;
import java.util.StringTokenizer;

public class P10869 {
    public static void main(String[] args) throws IOException {
        //BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        String str = br.readLine();
//
//        StringTokenizer st = new StringTokenizer(str, " ");
//
//        int A = Integer.parseInt(st.nextToken());
//        int B = Integer.parseInt(st.nextToken());
//
//        System.out.println(A + B);
//        System.out.println(A - B);
//        System.out.println(A * B);
//        System.out.println(A / B);
//        System.out.println(A % B);

        //BufferedReader and String.split()
        String[] str = br.readLine().split(" ");
        Integer A = Integer.parseInt(str[0]);
        Integer B = Integer.parseInt(str[1]);

        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B);
        System.out.println(A%B);
    }
}
