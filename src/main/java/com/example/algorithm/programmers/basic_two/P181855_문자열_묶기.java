package com.example.algorithm.programmers.basic_two;

import java.util.HashMap;
import java.util.Map;

public class P181855_문자열_묶기 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(new String[]{"a", "bc", "d", "efg", "hi"}));
    }

    /**
     * 주어진 문자열 배열에서 각 문자열의 길이를 기준으로 개수를 세고,
     * 가장 많이 등장한 문자열 길이의 개수를 반환하는 함수.
     * <p>
     * 동작 원리:
     * 1. Map<Integer, Integer>를 사용해 <문자열 길이, 등장 횟수>를 저장.
     * 2. 문자열 배열을 순회하며 각 문자열의 길이를 키로 하여 Map에 저장하거나, 기존 값을 증가시킴.
     * 3. Map에 저장된 값들 중 최대값을 찾아 반환.
     */
    class Solution {
        public static int solution(String[] strArr) {
            int answer = 0;
            Map<Integer, Integer> lengthCount = new HashMap<>();

            for (String s : strArr) {
                int length = s.length();
                lengthCount.put(length, lengthCount.getOrDefault(length, 0) + 1);
            }

            for (Integer value : lengthCount.values()) {
                if (answer < value) {
                    answer = value;
                }
            }

            return answer;
        }
    }
}
