package com.example.algorithm.programmers.level2;

import java.util.HashMap;
import java.util.Map;

public class P131127_할인_행사 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(new String[]{"banana", "apple", "rice", "pork", "pot"}, new int[]{3, 2, 2, 2, 1}, new String[]{"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"}));
        System.out.println(Solution.solution(new String[]{"apple"}, new int[]{10}, new String[]{"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"}));
    }

    class Solution {
        public static int solution(String[] want, int[] number, String[] discount) {
            Map<String, Integer> wantMap = new HashMap<>();

            // 1. 원하는 제품 목록을 Map에 저장
            for (int i = 0; i < want.length; i++) {
                wantMap.put(want[i], number[i]);
            }


            int answer = 0; // 회원가입 가능한 날 수
            int n = discount.length;

            // 2. 슬라이디 윈도우 탐색
            for (int i = 0; i <= n - 10; i++) {
                Map<String, Integer> discountMap = new HashMap<>();

                // 3. 현재 10일 동안의 할인 품목 저장
                for (int j = i; j < i + 10; j++) {
                    discountMap.put(discount[j], discountMap.getOrDefault(discount[j], 0) + 1);
                }

                // 4. 두 개의 맵이 같은지 비교
                if (wantMap.equals(discountMap)) {
                    answer++;
                }
            }

            return answer;
        }
    }
}
