package com.example.algorithm.programmers.basic_three;

import java.util.*;

public class P181858_무작위로_K개의_수_뽑기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(new int[]{0, 1, 1, 2, 2, 3}, 3)));
        System.out.println(Arrays.toString(Solution.solution(new int[]{0, 1, 1, 1, 1}, 4)));
    }

    class Solution {
        public static int[] solution(int[] arr, int k) {
            Set<Integer> uniqueNumbers = new HashSet<>(); // 중복 제거 역할
            List<Integer> numList = new ArrayList<>(); // 결과 저장 역할

            for (int num : arr) {
                if (uniqueNumbers.size() < k && uniqueNumbers.add(num)) { // 중복이 아니면서 k개 보다 작을 때
                    numList.add(num);
                }
            }


            int[] answer = new int[k];
            Arrays.fill(answer, -1); // 배열을 -1로 초기화
            for (int i = 0; i < numList.size(); i++) {
                answer[i] = numList.get(i); //List의 값을 배열에 할당
            }

            return answer;
        }
    }
}
