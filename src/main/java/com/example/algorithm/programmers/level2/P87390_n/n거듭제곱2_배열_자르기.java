package com.example.algorithm.programmers.level2.P87390_n;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class n거듭제곱2_배열_자르기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(3, 2, 5)));
        System.out.println(Arrays.toString(Solution.solution(4, 7, 14)));
    }

    class Solution {
        public static int[] solution(int n, long left, long right) {
            List<Integer> result = new ArrayList<>();

            for (long i = left; i <= right; i++) {
                int row = (int) (i / n);
                int col = (int) (i % n);
                result.add(Math.max(row, col) + 1);
            }

            return result.stream().mapToInt(Integer::intValue).toArray();
        }
    }

}
