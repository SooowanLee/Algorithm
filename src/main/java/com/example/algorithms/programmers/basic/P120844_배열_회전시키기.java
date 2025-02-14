package com.example.algorithms.programmers.basic;


import java.util.Arrays;

public class P120844_배열_회전시키기 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(new int[]{1, 2, 3}, "right")));
        System.out.println(Arrays.toString(Solution.solution(new int[]{4, 455, 6, 4, -1, 45, 6}, "left")));
    }

    class Solution {
        public static int[] solution(int[] numbers, String direction) {
            int[] answer = new int[numbers.length];

            if (direction.equals("right")) {
                int last = numbers[numbers.length - 1];

                for (int i = numbers.length - 2; i >= 0; i--) {

                    answer[i + 1] = numbers[i];
                }

                answer[0] = last;
            }

            if (direction.equals("left")) {
                int first = numbers[0];

                for (int i = numbers.length - 1; i > 0; i--) {
                    answer[i - 1] = numbers[i];
                }

                answer[numbers.length - 1] = first;
            }

            return answer;
        }
    }
}
