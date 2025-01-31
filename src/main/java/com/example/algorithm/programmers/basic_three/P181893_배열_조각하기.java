package com.example.algorithm.programmers.basic_three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P181893_배열_조각하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(new int[]{0, 1, 2, 3, 4, 5}, new int[]{4, 1, 2})));
    }

    class Solution {
        public static int[] solution(int[] arr, int[] query) {
            List<Integer> list = new ArrayList<>();
            for (int x : arr) {
                list.add(x);
            }

            for (int i = 0; i < query.length; i++) {
                if (i % 2 == 0) { // 짝수 인덱스
                    list = list.subList(0, query[i] + 1);
                } else {
                    list = list.subList(query[i], list.size());
                }
            }
            return list.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}
