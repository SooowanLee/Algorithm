package com.example.algorithms.programmers.level2;

import java.util.Arrays;

public class P42885_구명보트 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(new int[]{70, 50, 80, 50}, 100));
        System.out.println(Solution.solution(new int[]{70, 80, 50}, 100));
    }

    class Solution {
        public static int solution(int[] people, int limit) {
            Arrays.sort(people);
            int left = 0; // 가장 가벼운 사람
            int right = people.length - 1; // 가장 무거운 사람
            int answer = 0; // 보트 개수

            while (left <= right) {
                if (people[left] + people[right] <= limit) {
                    left++; // 가벼운 사람도 같이 태운다.
                }

                right--; // 무거운 사람은 무조건 태운다.
                answer++; // 보트 개수 증가
            }

            return answer;
        }
    }
}
