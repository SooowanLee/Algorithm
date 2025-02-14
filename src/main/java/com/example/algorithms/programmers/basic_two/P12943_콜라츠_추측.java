package com.example.algorithms.programmers.basic_two;

public class P12943_콜라츠_추측 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(6));
        System.out.println(Solution.solution(16));
        System.out.println(Solution.solution(626331));
    }

    class Solution {
        public static int solution(int num) {
            long answer = num; //오버플로우 방지를 위해 long 사용
            int count = 0;

            while (answer != 1) {
                count++;
                if (answer % 2 == 0) {
                    answer /= 2;
                } else {
                    answer = answer * 3 + 1;
                }
            }

            if (count >= 500) {
                return -1;
            }

            return count;
        }
    }
}
