package com.example.algorithm.programmers.basic_two;

import java.util.Arrays;

public class P120886_A로_B만들기 {
    public static void main(String[] args) {
        System.out.println(Solution.solution("olleh", "hello"));
        System.out.println(Solution.solution("allpe", "apple"));
    }

    /**
     * 문자열을 구성하는 문자의 순서가 달라도
     * 정렬하면 같은 문자열이 된다.
     */
    class Solution {
        public static int solution(String before, String after) {
            int answer = 0;

            char[] beforeCharArray = before.toCharArray();
            char[] afterCharArray = after.toCharArray();

            Arrays.sort(beforeCharArray);
            Arrays.sort(afterCharArray);

            if (Arrays.equals(beforeCharArray, afterCharArray)) {
                return 1;
            } else {
                return answer;
            }
        }
    }
}
