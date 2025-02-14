package com.example.algorithms.programmers.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P181940 {
    //입력받은 숫자만큼 문자열 반복하기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String my_string = st.nextToken();
        int k = Integer.parseInt(st.nextToken());

        System.out.println(solution(my_string, k));

    }

    static public String solution(String str, int k) {
       return str.repeat(k);
    }
}
