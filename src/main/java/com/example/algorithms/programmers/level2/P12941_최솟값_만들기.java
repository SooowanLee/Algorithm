package com.example.algorithms.programmers.level2;

import java.util.Arrays;

public class P12941_최솟값_만들기 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(new int[]{1, 4, 2}, new int[]{5, 4, 4}));
        System.out.println(Solution.solution(new int[]{1, 2}, new int[]{3, 4}));
    }

    class Solution {
        public static int solution(int[] A, int[] B) {
            int answer = 0;

            //A ,B 오름차순 정렬
            Arrays.sort(A);
            Arrays.sort(B);

            for (int i = 0; i < A.length; i++) {
                // 배열 A는 순방향, B는 역순으로 접근하여 곱하여 answer에 더함
                answer += A[i] * B[B.length - i - 1];
            }

            return answer;
        }
    }
}
