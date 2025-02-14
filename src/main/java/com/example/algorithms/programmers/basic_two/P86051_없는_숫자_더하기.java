package com.example.algorithms.programmers.basic_two;

import java.util.ArrayList;
import java.util.List;

public class P86051_없는_숫자_더하기 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(new int[]{1,2,3,4,6,7,8,0}));
        System.out.println(Solution.solution(new int[]{5,8,4,0,6,7,9}));
    }


    class Solution {
        public static int solution(int[] numbers) {
            int answer = 0;
            List<Integer> numberList = new ArrayList<>();

            for (int number : numbers) {
                numberList.add(number);
            }

            for (int i = 0; i <=9; i++) {
                if (!numberList.contains(i)) {
                    answer += i;
                }
            }

            return answer;
        }
    }
}
