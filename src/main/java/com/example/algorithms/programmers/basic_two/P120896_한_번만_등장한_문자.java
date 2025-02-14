package com.example.algorithms.programmers.basic_two;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P120896_한_번만_등장한_문자 {
    public static void main(String[] args) {
        System.out.println(Solution.solution("abcabcadc"));
        System.out.println(Solution.solution("abdc"));
        System.out.println(Solution.solution("hello"));
    }

    class Solution {
        public static String solution(String s) {
            //각 문자의 등장 횟수를 저장할 HashMap 생성
            Map<Character, Integer> charCounts = new HashMap<>();

            //문자열을 순회하며 각 문자의 등장 횟수를 계산
            for (char c : s.toCharArray()) {
                charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
            }

            //한 번만 등장하는 문자를 저장할 StringBuilder 생성
            StringBuilder uniqueChars = new StringBuilder();

            //등장 횟수가 1인 문자를 찾아서 StringBuilder에 추가
            for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
                if (entry.getValue() == 1) {
                    uniqueChars.append(entry.getKey());
                }
            }

            //StringBuilder의 내용을 char 배열로 변환 후 정렬
            char[] resultChars = uniqueChars.toString().toCharArray();
            Arrays.sort(resultChars);

            //정렬된 char 배열을 문자열로 변환하여 반환
            return new String(resultChars);
        }
    }
}
