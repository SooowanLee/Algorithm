package com.example.algorithm.programmers.basic;

import java.util.*;

/**
 * 문자열 정렬하기(1)
 */
public class P120850 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution("hi12392")));
        System.out.println(Arrays.toString(Solution.solution("p2o4i8gj2")));
        System.out.println(Arrays.toString(Solution.solution("abcde0")));
    }

    class Solution {
        public static int[] solution(String my_string) {
            List<Integer> numList = new ArrayList<>();

            for (char c : my_string.toCharArray()) {
                if (Character.isDigit(c)) {
                    numList.add(Character.getNumericValue(c));
                }
            }

            Collections.sort(numList);

            int[] numArr = new int[numList.size()];
            for (int i = 0; i < numList.size(); i++) {
                numArr[i] = numList.get(i);
            }
            return numArr;
        }
    }
}
