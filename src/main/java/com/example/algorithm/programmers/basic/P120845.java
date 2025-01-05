package com.example.algorithm.programmers.basic;

import java.util.Arrays;

/**
 * 주사위의 개수
 */
public class P120845 {

    public static void main(String[] args) {
        System.out.println(Solution.solution(new int[]{1, 1, 1}, 1));
        System.out.println(Solution.solution(new int[]{10, 8, 6}, 3));
    }

    class Solution {
        public static int solution(int[] box, int n) {
            int xCount = box[0] / n;
            int yCount = box[1] / n;
            int zCount = box[2] / n;

            //스트림을 사용한 풀이
            Arrays.stream(box)
                    .map(dim -> dim / n)
                    .reduce(1, (a, b) -> a * b);


            return xCount * yCount * zCount;
        }
    }
}
