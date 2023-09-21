package com.example.algorithm.baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P25304 {
    public static void main(String[] args) throws IOException {
        /**
         * 영수증
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int receiptTotalPrice = Integer.parseInt(br.readLine());
        int receiptTotalCount = Integer.parseInt(br.readLine());
        int productTotalPrice = 0;

        for (int i = 0; i < receiptTotalCount; i++) {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int productPrice = Integer.parseInt(st.nextToken());
            int productCount = Integer.parseInt(st.nextToken());

            productTotalPrice += productPrice * productCount;

        }
        if (productTotalPrice == receiptTotalPrice) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
