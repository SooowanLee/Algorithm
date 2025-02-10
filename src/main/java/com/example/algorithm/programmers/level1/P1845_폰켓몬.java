package com.example.algorithm.programmers.level1;

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
            for (int num : nums) {
                numSet.add(num);
            }

            answer = Math.min(numSet.size(), nums.length / 2);

            return answer;
        }
    }
}
