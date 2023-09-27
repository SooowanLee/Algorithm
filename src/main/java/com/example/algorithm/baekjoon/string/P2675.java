package com.example.algorithm.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2675 {
    public static void main(String[] args) throws IOException {
        /**
         * 문자열 반복
         * 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
         * 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다.
         * S에는 QR Code "alphanumeric" 문자만 들어있다.
         * QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
         */
        //BufferedReader() + split() + charAt()
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] str = br.readLine().split(" ");
            int R = Integer.parseInt(str[0]);
            String S = str[1];
            
            //입력받은 문자열 끝까지 돌면서 R만큼 반복한다.
            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < R; k++) {
                    System.out.print(S.charAt(j)); //문자열을 순회하기 때문에 j를 파라미터로 준다.
                }
            }
            System.out.println();
        }




        //BufferedReader() + StringBuilder() + getBytes()
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] str = br.readLine().split(" ");
            int R = Integer.parseInt(str[0]);
            byte[] bytes = str[1].getBytes();

            for (byte val : bytes) {
                for (int j = 0; j < R; j++) {
                    sb.append((char) val);
                }
            }
            sb.append(System.lineSeparator());
        }
        System.out.print(sb);*/
    }
}
