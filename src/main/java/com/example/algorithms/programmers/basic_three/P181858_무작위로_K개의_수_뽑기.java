package com.example.algorithms.programmers.basic_three;

import java.util.*;

public class P181858_무작위로_K개의_수_뽑기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(new int[]{0, 1, 1, 2, 2, 3}, 3)));
        System.out.println(Arrays.toString(Solution.solution(new int[]{0, 1, 1, 1, 1}, 4)));
    }

    class Solution {
        public static int[] solution(int[] arr, int k) {
            Set<Integer> uniqueNumber = new HashSet<>(); // 중복 제거 역할
            List<Integer> resultList = new ArrayList<>(); // 결과 저장 역할

            for (int num : arr) {
                if (uniqueNumber.size() < k && uniqueNumber.add(num)) {
                    resultList.add(num);
                }
            }

            int[] answer = new int[k];
            Arrays.fill(answer, -1); //배열을 -1로 초기화

            for (int i = 0; i < resultList.size(); i++) {
                answer[i] = resultList.get(i);
            }

            return answer;
        }
    }
}
