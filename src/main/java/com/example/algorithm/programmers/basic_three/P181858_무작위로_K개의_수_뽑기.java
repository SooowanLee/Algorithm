package com.example.algorithm.programmers.basic_three;

import java.util.*;

public class P181858_무작위로_K개의_수_뽑기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(new int[]{0, 1, 1, 2, 2, 3}, 3)));
        System.out.println(Arrays.toString(Solution.solution(new int[]{0, 1, 1, 1, 1}, 4)));
    }

    class Solution {
        public static int[] solution(int[] arr, int k) {
            List<Integer> numList = new ArrayList<>(); // 결과를 저장할 리스트

            for (int num : arr) {
                if (!numList.contains(num)) {
                    numList.add(num);
                }
            }


            int[] answer = new int[k];
            for (int i = 0; i < k; i++) {
                if (i < numList.size()) {
                    answer[i] = numList.get(i);
                } else {
                    answer[i] = -1;
                }
            }

            return answer;
        }
    }
}
