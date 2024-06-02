package com.example.algorithm.programmers.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P181943 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String my_string = st.nextToken();
        String overwrite_string = st.nextToken();
        int s = Integer.parseInt(st.nextToken());

        System.out.println(solution3(my_string, overwrite_string, s));
    }

    public static String solution1(String my_string, String overwrite_string, int s) {
        String before = my_string.substring(0, s);
        String after = my_string.substring(s + overwrite_string.length());
        System.out.println(after);

        return before + overwrite_string + after;
    }

    public static String solution2(String my_string, String overwrite_string, int s) {
        String result = my_string.substring(0, s) + overwrite_string;

        if (my_string.length() > result.length()) {
            result += my_string.substring(result.length());
        }

        return result;
    }

    public static String solution3(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder(my_string);
        sb.replace(s, s + overwrite_string.length(), overwrite_string);
        return sb.toString();
    }
}
