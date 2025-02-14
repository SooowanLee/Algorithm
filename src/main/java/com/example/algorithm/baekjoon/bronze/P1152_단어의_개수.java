package com.example.algorithm.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1152_단어의_개수 {
    public static void main(String[] args) throws IOException {
        System.out.println(Solution.solution("The Curious Case of Benjamin Button"));
        System.out.println(Solution.solution(" The first character is a blank"));
        System.out.println(Solution.solution("The last character is a blank "));
    }

    class Solution {
        public static int solution(String str) throws IOException {
            int answer = 0;

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            System.out.println(st.countTokens());

            return answer;
        }
    }
}
