package com.example.algorithm.baekjoon.condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int checkLeapYear = Integer.parseInt(br.readLine());

        if (checkLeapYear % 4 == 0 && checkLeapYear % 100 != 0 || checkLeapYear % 400 == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    }
}
