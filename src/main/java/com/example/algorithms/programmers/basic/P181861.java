package com.example.algorithms.programmers.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 배열의 원소만큼 추가하기
 */
public class P181861 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(new int[]{5, 1, 4})));
        System.out.println(Arrays.toString(Solution.solution(new int[]{6, 6})));
        System.out.println(Arrays.toString(Solution.solution(new int[]{1})));
    }

    class Solution {
        public static int[] solution(int[] arr) {
            List<Integer> numList = new ArrayList<>();

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i]; j++) {
                    numList.add(arr[i]);
                }
            }

            int[] numArr = new int[numList.size()];

            for (int i = 0; i < numList.size(); i++) {
                numArr[i] = numList.get(i);
            }

            return numArr;
        }
    }
}
