package com.example.algorithms.programmers.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P181895_배열_만들기_3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(new int[]{1, 2, 3, 4, 5}, new int[][]{{1, 3}, {0, 4}})));
    }

    class Solution {
        public static int[] solution(int[] arr, int[][] intervals) {
            List<Integer> list = new ArrayList<>();

            for (int i = intervals[0][0]; i <= intervals[0][1]; i++) {
                list.add(arr[i]);
            }

            for (int i = intervals[1][0]; i <= intervals[1][1]; i++) {
                list.add(arr[i]);
            }

            int[] answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }

            return answer;
        }
    }
}
