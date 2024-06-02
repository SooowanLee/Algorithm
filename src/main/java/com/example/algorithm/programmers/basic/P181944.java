package com.example.algorithm.programmers.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P181944 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int num = Integer.parseInt(s);
        String result = num + " is" + (num % 2 == 0 ? " even" : " odd");
        System.out.println(result);
    }
}
