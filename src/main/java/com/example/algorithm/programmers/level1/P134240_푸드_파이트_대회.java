package com.example.algorithm.programmers.level1;

public class P134240_푸드_파이트_대회 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(new int[]{1, 3, 4, 6}));
        System.out.println(Solution.solution(new int[]{1, 7, 1, 2}));
    }

    class Solution {
        public static String solution(int[] food) {
            String answer = "";
            StringBuilder sb = new StringBuilder();

            //왼쪽 선수 음식 배치
            for (int i = 1; i < food.length; i++) {
                int count = food[i] / 2; // 각 음식 종류별 선수당 먹을 수 있는 개수 계산
                for (int j = 0; j < count; j++) {
                    sb.append(i);
                }
            }
            sb.append(0);

            // 오른쪽 선수 음식 배치(역순)
            for (int i = food.length - 1; i >= 1; i--) {
                int count = food[i] / 2;
                for (int j = 0; j < count; j++) {
                    sb.append(i);
                }
            }

            answer = sb.toString();

            return answer;
        }
    }
}
