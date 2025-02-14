package com.example.algorithms.programmers.basic_three;

public class P120812_최빈값_구하기 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(new int[]{1, 2, 3, 3, 3, 4}));
        System.out.println(Solution.solution(new int[]{1, 1, 2, 2}));
        System.out.println(Solution.solution(new int[]{1}));
    }

    class Solution {
        public static int solution(int[] array) {
            int answer = 0;
            int[] count = new int[1000];
            int maxCount = 0; // 최빈값의 등장 횟수
            boolean duplicate = false; // 최빈값이 여러 개인지 체크

            // 1. 숫자의 빈도수 카운팅
            for (int num : array) {
                count[num]++;
            }

            // 2. 최빈값 찾기
            for (int i = 0; i < count.length; i++) {
                if (count[i] > maxCount) {
                    maxCount = count[i];
                    answer = i;
                    duplicate = false; // 새로운 최빈값이 나왔으므로 중복 초기화
                } else if (count[i] == maxCount) {
                    duplicate = true; // 같은 최대 등장 횟수를 가진 숫자가 있음
                }
            }

            return duplicate ? -1 : answer;
        }
    }
}
