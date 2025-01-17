package com.example.algorithm.programmers.basic_two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P181894_2의_영역 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(new int[]{1, 2, 1, 4, 5, 2, 9})));
        System.out.println(Arrays.toString(Solution.solution(new int[]{1, 2, 1})));
        System.out.println(Arrays.toString(Solution.solution(new int[]{1, 1, 1})));
        System.out.println(Arrays.toString(Solution.solution(new int[]{1, 2, 1, 2, 1, 10, 2, 1})));
    }

    class Solution {
        public static int[] solution(int[] arr) {
            List<Integer> twoList = new ArrayList<>();

            // 1. 2의 인덱스 찾기
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 2) {
                    twoList.add(i);
                }
            }

            // 2. 2가 없는 경우
            if (twoList.isEmpty()) {
                return new int[]{-1};
            }

            // 3. 부분 배열 추출
            int startIndex = twoList.get(0);
            int endIndex = twoList.get(twoList.size() - 1);

            return Arrays.copyOfRange(arr, startIndex, endIndex + 1);
        }
    }
}
