package com.example.algorithm.programmers.basic_two;

public class P120843_공_던지기 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(new int[]{1, 2, 3, 4}, 2));
        System.out.println(Solution.solution(new int[]{1, 2, 3, 4, 5, 6}, 5));
        System.out.println(Solution.solution(new int[]{1, 2, 3}, 3));
    }

    class Solution {
        public static int solution(int[] numbers, int k) {
            int index = 0; //공을 가진 사람의 인덱스

            for (int i = 1; i < k; i++) {   //k번째 던지는 사람을 구해야 하므로 k-1번 이동
                index = (index + 2) % numbers.length;
            }


            return numbers[index];
        }
    }
}
