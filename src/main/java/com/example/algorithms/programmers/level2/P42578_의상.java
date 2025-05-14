package com.example.algorithms.programmers.level2;

import java.util.HashMap;
import java.util.Map;

public class P42578_의상 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}}));
        System.out.println(Solution.solution(new String[][]{{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}}));
    }

    class Solution {
        public static int solution(String[][] clothes) {
            Map<String, Integer> map = new HashMap<>();

            // 의상의 종류별 개수 카운트
            for (String[] clothe : clothes) {
                map.put(clothe[1], map.getOrDefault(clothe[1], 0) + 1);
            }

            // 경우의 수 계산 (각 종류별로 안 입는 경우 포함하여 곱하기)
            int answer = 1;
            for (Integer count : map.values()){
                answer *= (count + 1); // 안 입는 경우 포함
            }

            return answer - 1; // 아무것도 안 입는 경우 제외
        }
    }
}
