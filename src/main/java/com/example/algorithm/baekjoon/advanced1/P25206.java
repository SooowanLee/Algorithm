package com.example.algorithm.baekjoon.advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P25206 {
    public static void main(String[] args) throws IOException {
        /**
         * 너의 평점은
         * 전공 평점 = (SUM(학점X과목평점)) / SUM(학점)
         * 과목 평점 = 등급에 따라, P는 제외
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = new String[20];
        double totalSum = 0.0;
        double scoreSum = 0.0;
        String[] grades = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
        double[] gradeScore = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};

        for (int i = 0; i < 20; i++) {
            str[i] = br.readLine();
            StringTokenizer st = new StringTokenizer(str[i]);
            String subject = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            for (int j = 0; j < 10; j++) {
                if (grade.equals(grades[j])) {
                    totalSum += score * gradeScore[j];

                    if (j != 9) {
                        scoreSum += score;
                    }
                }
            }
        }

        double average = totalSum / scoreSum;
        System.out.printf("%.6f", average);
    }
}


