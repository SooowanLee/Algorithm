package com.example.algorithm.programmers.basic_two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P120852_소인수분해 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(12)));
        System.out.println(Arrays.toString(Solution.solution(17)));
        System.out.println(Arrays.toString(Solution.solution(420)));
    }

    class Solution {
        public static int[] solution(int n) {
            List<Integer> prime = new ArrayList<>();

            for (int i = 2; i <= n; i++) {
                while (n % i == 0) {
                    prime.add(i);

                    n /= i;
                }
            }

            if (n > 1) {
                prime.add(n);
            }

            return prime.stream()
                    .distinct()
                    .sorted()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }
    }
}
