package com.example.algorithm.programmers.basic;

import java.util.Arrays;

/**
 * 정수 리스트 num_list가 주어질 때, 마지막 원소가 그전 원소보다 크면
 * 마지막 원소에서 그전 원소를 뺀 값을 마지막 원소가 그전 원소보다 크지 않다면
 * 마지막 원소를 두 배 한 값을 추가하여 return
 */
public class P181927 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(new int[]{2, 1, 6})));
        System.out.println(Arrays.toString(Solution.solution(new int[]{5, 2, 1, 7, 5})));
    }


    class Solution {
        public static int[] solution(int[] num_list) {
            int[] answer = Arrays.copyOf(num_list, num_list.length + 1);

            int last = num_list[num_list.length - 1];
            int beforeLast = num_list[num_list.length - 2];

            int addValue = (last > beforeLast) ? (last - beforeLast) : (last * 2);

            answer[answer.length - 1] = addValue;

            return answer;
        }
    }
}
