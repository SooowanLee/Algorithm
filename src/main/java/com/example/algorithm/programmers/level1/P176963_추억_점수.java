package com.example.algorithm.programmers.level1;

import java.util.*;

public class P176963_추억_점수 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(new String[]{"may", "kein", "kain", "radi"}, new int[]{5, 10, 1, 3}, new String[][]{{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}})));
        System.out.println(Arrays.toString(Solution.solution(new String[]{"kali", "mari", "don"}, new int[]{11, 1, 55}, new String[][]{{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}})));
        System.out.println(Arrays.toString(Solution.solution(new String[]{"may", "kein", "kain", "radi"}, new int[]{5, 10, 1, 3}, new String[][]{{"may"}, {"kein", "deny", "may"}, {"kon", "coni"}})));
    }

    class Solution {
        public static int[] solution(String[] name, int[] yearning, String[][] photo) {
            // 이름과 그리움 점수를 매핑
            Map<String, Integer> scoreMap = new HashMap<>();
            for (int i = 0; i < name.length; i++) {
                scoreMap.put(name[i], yearning[i]);
            }

            int[] answer = new int[photo.length];

            // 각 사진별 점수 계산
            for (int i = 0; i < photo.length; i++) {
                int score = 0;
                for (String person : photo[i]) {
                    score += scoreMap.getOrDefault(person, 0); // 없는 경우 0점 처리
                }
                answer[i] = score;
            }

            return answer;
        }
    }
}
