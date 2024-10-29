package com.example.algorithm.programmers.basic;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P181930 {
    public static void main(String[] args) {
        /*System.out.println(Solution.solutionSet(2, 6, 1));
        System.out.println(Solution.solutionSet(5, 3, 3));
        System.out.println(Solution.solutionSet(4, 4, 4));*/


        System.out.println(Solution.solutionIf(2, 6, 1));
        System.out.println(Solution.solutionIf(5, 3, 3));
        System.out.println(Solution.solutionIf(4, 4, 4));


    }

    class Solution {
        public static int solutionSet(int a, int b, int c) {
            int answer = 0;
            Set<Integer> cubes = Stream.of(a, b, c).collect(Collectors.toSet());

            if (cubes.size() < 2) {
                answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
            } else if (cubes.size() < 3) {
                answer = (a + b + c) * (a * a + b * b + c * c);
            } else {
                answer = a + b + c;
            }

            return answer;
        }

        public static int solutionIf(int a, int b, int c) {
            int answer = a + b + c;

            if (a == b && a == c) {
                answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
            } else if (a == b || a == c || b == c) {
                answer = (a + b + c) * (a * a + b * b + c * c);
            }

            return answer;
        }
    }
}
