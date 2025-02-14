package com.example.algorithms.programmers.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P181946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().replaceAll(" ", "");

        System.out.println(str);
    }
}
