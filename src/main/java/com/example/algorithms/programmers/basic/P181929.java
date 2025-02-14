package com.example.algorithms.programmers.basic;

import java.util.Arrays;

/**
 *
 */
public class P181929 {
    public static void main(String[] args) {
        System.out.println(Solution.solutionLoop(new int[]{3, 4, 5, 2, 1}));
        System.out.println(Solution.solutionLoop(new int[]{5, 7, 8, 3}));

        System.out.println(Solution.solutionStream(new int[]{3, 4, 5, 2, 1}));
        System.out.println(Solution.solutionStream(new int[]{5, 7, 8, 3}));

    }

    class Solution {

        public static int solutionStream(int[] num_list) {
            int sum = Arrays.stream(num_list).sum();
            int product = Arrays.stream(num_list).reduce(1, (a, b) -> a * b);
            int sumSquared = sum * sum;

            return product < sumSquared ? 1 : 0;
        }


        public static int solutionLoop(int[] num_list) {
            int sum = 0;
            int product = 1;

            for (int num : num_list) {
                sum += num;
                product *= num;
            }

            int sumSquared = sum * sum;

            return product < sumSquared ? 1 : 0;
        }

    }

}
