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
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //배열을 사용한 방법1
       /* int[] arr = new int[10];
        boolean bl;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine()) % 42;
        }

        for (int i = 0; i < arr.length; i++) {
            bl = false;

            for (int k = i + 1; k < arr.length; k++) {
                if (arr[i] == arr[k]) {
                    bl = true;
                    break;
                }
            }
            if (!bl) {
                count++;
            }
        }
        System.out.println(count);*/

        //배열을 사용한 방법2
      /*  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[42];

        for (int i = 0; i < 10; i++) {
            arr[Integer.parseInt(br.readLine()) % 42] = true;
        }

        int count = 0;
        for (boolean value : arr) {
            if (value) {
                count++;
            }
        }

        System.out.println(count);*/

        //HashSet사용
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            hashSet.add(Integer.parseInt(br.readLine()) % 42);
        }
        System.out.print(hashSet.size());
    }
}
