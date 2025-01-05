package com.example.algorithm.programmers.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 콜라츠 수열 만들기
 */
public class P181919_콜라츠_수열_만들기 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(10)));
    }

    class Solution {
        public static int[] solution(int n) {
            List<Integer> list = new ArrayList<>();
            int i = 0;

            list.add(n);
            while (list.get(i) != 1) {
                if (list.get(i) % 2 == 0) {
                    list.add(list.get(i) / 2);
                } else {
                    list.add(3 * list.get(i) + 1);
                }
                i++;
            }

            int[] answer = new int[list.size()];
            for (int j = 0; j < list.size(); j++) {
                answer[j] = list.get(j);
            }

            return answer;
        }
    }
}
