package com.example.algorithms.programmers.basic_two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P181859_배열_만들기_6 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(new int[]{0, 1, 1, 1, 0})));
        System.out.println(Arrays.toString(Solution.solution(new int[]{0, 1, 0, 1, 0})));
        System.out.println(Arrays.toString(Solution.solution(new int[]{0, 1, 1, 0})));
    }

    class Solution {
        public static int[] solution(int[] arr) {
            List<Integer> stk = new ArrayList<>();

            for (int i = 0; i < arr.length;) {
                if (stk.isEmpty()) {
                    stk.add(arr[i]);
                    i++;
                } else if (!stk.isEmpty() && stk.get(stk.size() - 1) == arr[i]) {
                    stk.remove(stk.size() - 1);
                    i++;
                } else {
                    stk.add(arr[i]);
                    i++;
                }
            }

            if (stk.isEmpty()) {
                return new int[]{-1};
            } else {
                return stk.stream().mapToInt(Integer::intValue).toArray();
            }
        }
    }
}
