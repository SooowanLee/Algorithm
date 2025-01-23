package com.example.algorithm.programmers.basic_three;

import java.util.Arrays;

public class P181923_수열과_구간_쿼리_2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(new int[]{0, 1, 2, 4, 3}, new int[][]{{0, 4, 2}, {0, 3, 2}, {0, 2, 2}})));
    }

    class Solution {
        public static int[] solution(int[] arr, int[][] queries) {
            int[] answer = new int[queries.length];

            for (int i = 0; i < queries.length; i++) {
                int s = queries[i][0];
                int e = queries[i][1];
                int k = queries[i][2];

                int min = Integer.MAX_VALUE; // k보다 큰 값 중 최소값을 저장할 변수
                boolean found = false; // k보다 큰 값을 찾았는지 여부를 나타내는 변수

                for (int j = s; j <= e; j++) {
                    if (arr[j] > k) { // k보다 큰 경우
                        if (arr[j] < min) { // 현재까지 찾은 최소값보다 작으면 갱신
                            min = arr[j];
                        }
                        found = true; // k보다 큰 i값을 찾음
                    }
                }
                if (found) { // k보다 큰 값을 찾은 경우
                    answer[i] = min; //최소값을 결과 배열에 저장
                } else { // k보다 큰 값을 못찾은 경우
                    answer[i] = -1; // -1을 결과 배열에 저장
                }
            }

            return answer;
        }
    }
}
