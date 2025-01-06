package com.example.algorithm.programmers.basic;

import java.util.Arrays;

public class P12932_자연수_뒤집어_배열로_만들기 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(12345)));
    }

    class Solution {
        public static int[] solution(long n) {
            //Stream을 사용한 방법
            int[] nArr = new StringBuilder().append(n)
                    .reverse()
                    .chars()
                    .map(Character::getNumericValue)
                    .toArray();


            //for를 사용한 방법
            String[] split = String.valueOf(n).split("");
            int[] answer = new int[split.length];

            for (int i = 1; i <= split.length; i++) {
                answer[i - 1] = Integer.parseInt(split[split.length - i]);
            }

            return nArr;
        }
    }
}
