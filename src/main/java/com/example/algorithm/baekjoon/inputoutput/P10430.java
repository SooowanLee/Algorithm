package com.example.algorithm.baekjoon.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10430 {
    public static void main(String[] args) throws IOException {

        /**
         * 나머지 구하기
         * 1. 입력은 공백단위로 구분 된다.
         * 2. 나머지를 구하는 문제라 변수를 정수형으로 계산한다.
         */
        
        //StringTokenizer() 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

//        int A = Integer.parseInt(st.nextToken());
//        int B = Integer.parseInt(st.nextToken());
//        int C = Integer.parseInt(st.nextToken());
        
        //split()을 사용
        String[] strings = br.readLine().split(" ");

        int A = Integer.parseInt(strings[0]);
        int B = Integer.parseInt(strings[1]);
        int C = Integer.parseInt(strings[2]);

        System.out.println((A + B) % C);
        System.out.println((A % C + B % C) % C);
        System.out.println((A * B) % C);
        System.out.println(((A % C * B % C)) % C);

    }
}
