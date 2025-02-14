package com.example.algorithms.programmers.level1;

import java.util.HashSet;
import java.util.Set;

public class P1845_폰켓몬 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(new int[]{3, 1, 2, 3}));
        System.out.println(Solution.solution(new int[]{3, 3, 3, 2, 2, 4}));
        System.out.println(Solution.solution(new int[]{3, 3, 3, 2, 2, 2}));
    }

    class Solution {
        public static int solution(int[] nums) {
            int answer = 0;
            Set<Integer> numSet = new HashSet<>();

            //Set에 nums를 저장 중복되는 숫자는 한 개만 저장된다.
            for (int num : nums) {
                numSet.add(num);
            }

            // N/2와 Set의 크기 중 작은 쪽을 반환
            answer = Math.min(numSet.size(), nums.length / 2);

            return answer;
        }
    }
}
