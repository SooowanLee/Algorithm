package com.example.algorithms.programmers.basic_three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P181918_배열_만들기_4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(new int[]{1, 4, 2, 5, 3})));
    }

    class Solution {
        public static int[] solution(int[] arr) {
            List<Integer> stkList = new ArrayList<>();

            for (int i = 0; i < arr.length;) {
                if (stkList.isEmpty()) {
                    stkList.add(arr[i]);
                    i++;
                } else if (stkList.get(stkList.size() - 1) < arr[i]) {
                    stkList.add(arr[i]);
                    i++;
                } else {
                    stkList.remove(stkList.size() - 1);
                }
            }

            return stkList.stream()
                    .mapToInt(Integer::intValue)
                      .toArray();
        }
    }
}
