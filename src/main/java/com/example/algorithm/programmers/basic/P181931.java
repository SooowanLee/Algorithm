package com.example.algorithm.programmers.basic;


import java.util.stream.IntStream;

/**
 * 두 정수 a, d와 길이가 n인 boolean 배열 included가 주어집니다.
 * 첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할 때,
 * 이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을 return
 */
public class P181931 {
    public static void main(String[] args) {
        boolean[] included = {false, false, false, true, false, false, false};
//        System.out.println(Solution.solutionIf(7, 1, included));
        System.out.println(Solution.solutionStream(7, 1, included));
    }

    class Solution {
        public static int solutionStream(int a, int d, boolean[] included) {
            return IntStream.range(0, included.length)
                    .map(idx -> included[idx] ? a + (idx * d) : 0)
                    .sum();
        }

       /* public static int solutionIf(int a, int d, boolean[] included) {
            int answer = 0;

            for (int i = 0; i < included.length; i++) {
                if (included[i]) {
                    answer += a;
                }
                a += d;
            }

            return answer;
        }*/
    }
}
