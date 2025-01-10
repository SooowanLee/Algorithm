package com.example.algorithm.programmers.basic_two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P12910_나누어_떨어지는_숫자_배열 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(new int[]{5, 9, 7, 10}, 5)));
        System.out.println(Arrays.toString(Solution.solution(new int[]{2, 36, 1, 3}, 1)));
        System.out.println(Arrays.toString(Solution.solution(new int[]{3, 2, 6}, 10)));
    }

    class Solution {
        public static int[] solution(int[] arr, int divisor) {
            List<Integer> divisorArr = new ArrayList<>();

            for (int i : arr) {
                if (i % divisor == 0) {
                    divisorArr.add(i);
                }
            }

            if (divisorArr.isEmpty()) {
                divisorArr.add(-1);
            }

            int[] answer = new int[divisorArr.size()];
            for (int i = 0; i < divisorArr.size(); i++) {
                answer[i] = divisorArr.get(i);
            }

            Arrays.sort(answer);

            return answer;
        }
    }
}
