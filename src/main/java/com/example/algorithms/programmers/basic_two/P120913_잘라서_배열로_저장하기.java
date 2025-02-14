package com.example.algorithms.programmers.basic_two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P120913_잘라서_배열로_저장하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution("abc1Addfggg4556b", 6)));
        System.out.println(Arrays.toString(Solution.solution("abcdef123", 3)));
    }

    class Solution {
        public static String[] solution(String my_str, int n) {
            List<String> list = new ArrayList<>();

            for (int i = 0; i < my_str.length(); i += n) {
                int end = Math.min(i + n, my_str.length()); //문자열 길이 초과 방지
                list.add(my_str.substring(i, end));
            }

            return list.toArray(new String[0]);
        }
    }
}
