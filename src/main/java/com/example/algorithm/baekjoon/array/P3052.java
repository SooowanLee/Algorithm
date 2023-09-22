package com.example.algorithm.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class P3052 {
    public static void main(String[] args) throws IOException {
        /**
         * 나머지
         */
        //배열을 사용한 방법
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        boolean[] arr = new boolean[42];
//
//        for (int i = 0; i < 10; i++) {
//            arr[Integer.parseInt(br.readLine()) % 42] = true;
//        }
//
//        int count = 0;
//        for (boolean value : arr) {
//            if (value) {
//                count++;
//            }
//        }

//        System.out.println(count);


        //HashSet을 사용한 방법
        //중복이 안되는 특성을 이용하여 서로 다른 숫자를 저장하고 갯수를 세기 좋다
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> h = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            h.add(sc.nextInt() % 42);
        }

        sc.close();
        System.out.println(h.size());
    }
}
