package com.example.algorithms.programmers.basic_two;

import java.util.Arrays;

public class P120835_진료순서_정하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(new int[]{3, 76, 24})));
        System.out.println(Arrays.toString(Solution.solution(new int[]{1, 2, 3, 4, 5, 6, 7})));
        System.out.println(Arrays.toString(Solution.solution(new int[]{30, 10, 23, 6, 100})));
    }

    class Solution {
        public static int[] solution(int[] emergency) {
            int[] sortedEmergency = Arrays.copyOf(emergency, emergency.length); //원본 배열 복사
            Arrays.sort(sortedEmergency);

            int[] answer = new int[emergency.length];
            for (int i = 0; i < emergency.length; i++) {
                for (int j = 0; j < sortedEmergency.length; j++) {
                    if (emergency[i] == sortedEmergency[j]) {
                        answer[i] = emergency.length - j; //내림차순 순서 계산
                        break; //만약 중복된 값이 있다면 break가 없다면 순서가 엉망이 될 수 있다.
                    }
                }
            }

            return answer;
        }
    }
}
