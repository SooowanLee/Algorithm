package com.example.algorithm.programmers.basic;

import java.util.Arrays;
import java.util.stream.Collectors;

public class P120911_문자열_정렬하기_2 {

    public static void main(String[] args) {
        System.out.println(Solution.solution("Bcad"));
        System.out.println(Solution.solution("heLLo"));
        System.out.println(Solution.solution("Python"));
    }


    class Solution {
        public static String solution(String my_string) {
//            char[] charArray = my_string.toLowerCase().toCharArray();
//            Arrays.sort(charArray);

//            return String.valueOf(charArray);
            return Arrays.stream(my_string.toLowerCase().split("")).sorted().collect(Collectors.joining());
        }
    }
}
