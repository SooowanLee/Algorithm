package com.example.algorithms.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10809 {
    public static void main(String[] args) throws IOException {
        /**
         * 알파벳 찾기
         * 1. 알파벳 소문자로만 이루어진 단어 S가 주어진다. 단어의 길이는 100을 넘지 않는다.
         * 2. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를
         * 3. 포함되어 있지 않은 경우에는 -1을 출력하시오
         */

        //array + charAt()
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (arr[c - 'a'] == -1) {
                arr[c - 'a'] = i;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

        //indexOf()
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(s.indexOf(c) + " ");
        }
    }
}
