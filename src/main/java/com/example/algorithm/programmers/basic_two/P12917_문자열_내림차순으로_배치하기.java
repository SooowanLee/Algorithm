package com.example.algorithm.programmers.basic_two;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P12917_문자열_내림차순으로_배치하기 {
    public static void main(String[] args) {
        System.out.println(Solution.solution("Zbcdefg"));
    }

    class Solution {
        public static String solution(String s) {
            //1. 문자열을 문자 배열로 변환
            char[] charArray = s.toCharArray();

            //2. 문자 배열을 내림차순으로 정렬
            Arrays.sort(charArray);

            //3.  배열을 뒤집어 내림차순으로 변환
            StringBuilder sortedStr = new StringBuilder(new String(charArray));
//            return sortedStr.reverse().toString();


            //Stream API
            return Stream.of(s.split(""))
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.joining());
        }
    }
}
