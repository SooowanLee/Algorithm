package com.example.algorithms.programmers.basic;

import java.util.Arrays;

/**
 * 배열의 길이에 따라 다른 연산하기
 */
public class P181854 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(new int[] {49, 12, 100, 276, 33}, 27)));
        System.out.println(Arrays.toString(Solution.solution(new int[] {444, 555, 666, 777}, 100)));
    }

    /**
     * 배열의 길이가 홀수이면서 인덱스가 짝수이거나
     * 배열의 길이가 짝수이면서 인덱스가 홀수면 원래 배열의 값에 + n을 한다
     * 위 두 조건에 걸리지 않으면 그냥 배열의 값을 answer에 저장한다.
     */
    class Solution {

        public static int[] solution(int[] arr, int n) {
            int[] answer = new int[arr.length];

            //이런 방법도 있지만 배열은 복사해서 사용하는 것이 좋다.
           /* int idx = arr.length % 2 == 0 ? 1 : 0;

            for (int i = idx; i < arr.length; i+=2) {
                arr[i] += n;
            }*/

            for (int i = 0; i < arr.length; i++) {
                if (arr.length % 2 == 1 && i % 2 == 0 || arr.length % 2 == 0 && i % 2 == 1) {
                    answer[i] = arr[i] + n;
                } else {
                    answer[i] = arr[i];
                }
            }

            return answer;
        }
    }
}
