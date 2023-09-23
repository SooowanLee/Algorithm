package com.example.algorithm.baekjoon.string;

import java.util.Scanner;

public class P10809 {
    public static void main(String[] args) {
        /**
         * 알파벳 찾기
         * 1. 알파벳 소문자로만 이루어진 단어 S가 주어진다. 단어의 길이는 100을 넘지 않는다.
         * 2. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를
         * 3. 포함되어 있지 않은 경우에는 -1을 출력하시오
         */

        //1. 배열 사용
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26];

        //arr[]의 모든 인덱스를 -1로 초기화 한다.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        String s = sc.nextLine(); //sc로 입력받은 문자열을 한죽씩 읽어온다.

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (arr[ch - 'a'] == -1) {
                arr[ch - 'a'] = i;
            }
        }
        for (int var : arr) {
            System.out.print(var + " ");
        }

        //2. indexOf() 사용
        String str = sc.next();
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(str.indexOf(c) + " ");
        }
    }
}
