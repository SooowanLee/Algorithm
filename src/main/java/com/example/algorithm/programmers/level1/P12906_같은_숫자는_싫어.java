package com.example.algorithm.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P12906_같은_숫자는_싫어 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
        System.out.println(Arrays.toString(Solution.solution(new int[]{4, 4, 4, 3, 3})));
    }

    public class Solution {
        public static int[] solution(int[] arr) {
            List<Integer> answerList = new ArrayList<>();

            // 중복이 되지 않는 숫자는 일단 List에 저장
            // 리스트의 마지막 값과 배열의 값이 다르다면 List에 추가
            // 이미 contains로 중복된 값을 걸러서 저장했기 때문에
            // 리스트의 마지막 값과 배열의 값이 다르다는 의미는 연속된 숫자가 아니라는 뜻
            for (int i = 0; i < arr.length; i++) {
                if (!answerList.contains(arr[i]) || answerList.get(answerList.size() -1) != arr[i]) {
                    answerList.add(arr[i]);
                }
            }

            return answerList.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}
