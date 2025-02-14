package com.example.algorithms.baekjoon.inputoutput;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class P2557 {
    public static void main(String[] args) throws IOException {
        //다양한 종류의 Hello World! 출력 방법

        //가장 기본적인 방법
        System.out.println("Hello World!");

        //BufferedWriter 사용
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("Hello World!!");
        bw.flush();
        bw.close();

        //StringBuilder 사용
        StringBuilder sb = new StringBuilder();
        sb.append("Hello World!!!");

        System.out.println(sb);
    }
}
