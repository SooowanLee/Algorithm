package com.example.algorithms.programmers.level2;

import java.util.Arrays;

public class P42747_H_Index {
    public static void main(String[] args) {
        System.out.println(Solution.solution(new int[]{3, 0, 6, 1, 5}));
    }

    class Solution {
        public static int solution(int[] citations) {
            int answer = 0;
            int n = citations.length;

            Arrays.sort(citations);

            for (int i = 0; i < n; i++) {
                int h = n - i; // h번 이상 인용된 논문의 개수

                if (citations[i] >= h) {
                    return h; // h-index 결정
                }
            }
            
            return answer; // 모든 논문의 인용 횟수가 0인 경우
        }
    }
}
