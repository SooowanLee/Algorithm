package com.example.algorithm.programmers.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.*;

public class P181947 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        String[] strArr = str.split(" ");
        int i = parseInt(strArr[0]);
        int j = parseInt(strArr[1]);

        sb.append(i + " + " + j + " = " + (i + j));
        System.out.println(sb.toString());
    }
}
