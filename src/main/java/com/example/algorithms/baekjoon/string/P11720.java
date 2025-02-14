package com.example.algorithms.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11720 {
    public static void main(String[] args) throws IOException {
        /**
         * 숫자의 합
         * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
         * 아스키 코드에서 '0'은 48이기 때문에 getBytes[]와 charAt() 모두 '0'을 빼줘야 숫자로 변환이되어 잘 더해진다..
         */
        //getBytes[]
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer.parseInt(br.readLine());
        String s = br.readLine();
        int sum = 0;

//        for (byte value : s.getBytes()) {
//            sum += (value - '0');
//        }
//
//        System.out.print(sum);

        //charAt()
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }
        System.out.print(sum);
    }
}
