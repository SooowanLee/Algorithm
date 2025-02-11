package com.example.algorithm.programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P87390_n거듭제곱2_배열_자르기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(3, 2, 5)));
        System.out.println(Arrays.toString(Solution.solution(4, 7, 14)));
    }

    class Solution {
        public static int[] solution(int n, long left, long right) {
            List<Integer> result = new ArrayList<>();

            // 1차원 배열에서 필요한 인덱스만큼만 순회
            for (long i = left; i <= right; i++) {
                int row = (int) (i / n); // 행을 구함
                int col = (int) (i % n); // 열을 구함

                // 1차원 배열에서 인덱스를 찾기 위해 행과 열 중 큰 값을 추출
                // 인덱스를 제로베이스이기 때문에 +1을 해서 값을 저장
                result.add(Math.max(row, col) + 1);
            }

            return result.stream().mapToInt(Integer::intValue).toArray();
        }
    }

}
