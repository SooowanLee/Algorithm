package com.example.algorithms.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5622 {
    public static void main(String[] args) throws IOException {
        /**
         * 다이얼
         * 숫자 1을 걸려면 총 2초가 필요하다.
         * 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.
         * 상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다. 예를 들어, UNUCIC는 868242와 같다.
         * 할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하시오.
         */
        //BufferedReader() + switch-case
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int count = 0;
        int k = s.length();

        for (int i = 0; i < k; i++) {
            switch (s.charAt(i)) {
                case 'A':
                case 'B':
                case 'C':
                    count += 3;
                    break;

                case 'D':
                case 'E':
                case 'F':
                    count += 4;
                    break;

                case 'G':
                case 'H':
                case 'I':
                    count += 5;
                    break;

                case 'J':
                case 'K':
                case 'L':
                    count += 6;
                    break;

                case 'M':
                case 'N':
                case 'O':
                    count += 7;
                    break;

                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    count += 8;
                    break;

                case 'T':
                case 'U':
                case 'V':
                    count += 9;
                    break;

                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    count += 10;
                    break;
            }
        }

        System.out.println(count);

        /*//System.in + if-else
        int count = 0;
        int value;

        while (true) {
            value = System.in.read();

            if (value == '\n') break;

            if (value < 68) {
                count += 3;
            } else if (value < 71) {
                count += 4;
            } else if (value < 74) {
                count += 5;
            } else if (value < 77) {
                count += 6;
            } else if (value < 80) {
                count += 7;
            } else if (value < 84) {
                count += 8;
            } else if (value < 87) {
                count += 9;
            } else {
                count += 10;
            }
        }
        System.out.println(count);*/
    }
}
