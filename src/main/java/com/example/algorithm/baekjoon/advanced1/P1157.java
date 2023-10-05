package com.example.algorithm.baekjoon.advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1157 {
    public static void main(String[] args) throws IOException {
        /**
         * 단어 공부
         * 알파벳 대소문자로 된 단어가 주어지면, 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
         * 단, 대문자와 소문자를 구분하지 않는다.
         */

        //UpperCase 사용X
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') { //소문자인 경우
                arr[s.charAt(i) - 97]++;
            } else { //대문자인 경우
                arr[s.charAt(i) - 65]++;
            }
        }

        int max = -1;
        char ch = '?';
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65);
            } else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);*/
        
        //UpperCase 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();

        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - 'A';
            count[num]++;
        }

        int max = -1;
        char ch = '?';

        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                ch = (char) (i + 'A');
            } else if (count[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
