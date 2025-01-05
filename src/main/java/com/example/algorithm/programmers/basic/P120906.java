package com.example.algorithm.programmers.basic;

import java.util.Arrays;

public class P120906 {

    public static void main(String[] args) {
        System.out.println(Solution.solution(1234));
        System.out.println(Solution.solution(930211));
    }

    class Solution {
        public static int solution(int n) {
            int[] nArr = String.valueOf(n)
                    .chars()
                    .map(Character::getNumericValue)
                    .toArray();

            int nArrSum = Arrays.stream(nArr).sum();

            int nSum = Arrays.stream(String.valueOf(n).split(""))
                    .mapToInt(Integer::parseInt)
                    .sum();

            return nSum;
        }
    }

}
