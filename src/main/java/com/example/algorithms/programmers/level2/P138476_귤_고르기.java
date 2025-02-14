package com.example.algorithms.programmers.level2;

import java.util.*;

public class P138476_귤_고르기 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
        System.out.println(Solution.solution(4, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
        System.out.println(Solution.solution(2, new int[]{1, 1, 1, 1, 2, 2, 2, 3}));
    }

    /**
     * 1. 귤 크기별로 개수 세기
     * 2. 귤 내림차순 정렬
     * 3. 귤 크기별로 담기
     */
    class Solution {
        public static int solution(int k, int[] tangerine) {

            // 1. 귤 크기 별 개수 세기
            Map<Integer, Integer> countMap = new HashMap<>();
            for (int size : tangerine) {
                countMap.put(size, countMap.getOrDefault(size, 0) + 1);
            }

            // 2. 개수 기준으로 내림차순 정렬
            List<Integer> counts = new ArrayList<>(countMap.values());
            Collections.sort(counts, Collections.reverseOrder());

            // 3. 많이 등장하는 귤 크기부터 선택
            int sum = 0;
            int answer = 0;
            for (Integer count : counts) {
                sum += count; // 귤 크기별 개수 저장
                answer++; // 귤 담기
                if (sum >= k) { // 귤의 크기별 개수가 팔고싶은 귤의 개수와 같거나 넘는다면
                    return answer; // 담은 귤 개수 return
                }
            }

            return answer;
        }
    }
}
