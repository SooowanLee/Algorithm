package com.example.algorithms.programmers.basic_two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P12935_제일_작은_수_제거하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(Solution.solution(new int[]{10})));
    }

    class Solution {

        /**
         * 배열의 길이가 1이면 -1을 return
         * 가장 작은 수를 찾는다.
         * 배열의 요소가 가장 작은수가 아니면 list에 저장
         * 리스트를 배열로 변환해서 return
         */
        public static int[] solution(int[] arr) {
            //열의 길이가 1이면 -1을 return
            if (arr.length == 1) {
                return new int[]{-1};
            }

            //가장 작은 수를 찾는다.
            int min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }

            //배열의 요소가 가장 작은수가 아니면 list에 저장
            List<Integer> list = new ArrayList<>();
            for (int i : arr) {
                if (i != min) {
                    list.add(i);
                }
            }

            //리스트를 배열로 변환해서 return
//            return list.stream().mapToInt(i -> i).toArray();

            //리스트에 배열의 값을 전부 넣는다.
            List<Integer> list2 = new ArrayList<>();
            for (int i : arr) {
                list2.add(i);
            }

            //제일 작은 값을 탐색
            Integer min2 = Collections.min(list2);

            //제일 작은 값을 제거
            list2.remove(min2);

            return list2.stream().mapToInt(i -> i).toArray();
        }
    }
}
