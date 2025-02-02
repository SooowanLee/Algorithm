package com.example.algorithm.programmers.level1;

import java.util.Arrays;
import java.util.Comparator;

public class P12915_문자열_내_마음대로_정렬하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(new String[]{"sun", "bed", "car"}, 1)));
        System.out.println(Arrays.toString(Solution.solution(new String[]{"abce", "abcd", "cdx"}, 2)));
    }

    class Solution {
        public static String[] solution(String[] strings, int n) {
            Arrays.sort(strings, new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    char c1 = s1.charAt(n);
                    char c2 = s2.charAt(n);

                    if (c1 == c2) {
                        return s1.compareTo(s2); // n번째 문자가 같으면 사전순 정렬
                    } else {
                        return Character.compare(c1, c2); // n번째 문자 기준 정렬
                    }
                }
            });

            return strings;
        }
    }
}
