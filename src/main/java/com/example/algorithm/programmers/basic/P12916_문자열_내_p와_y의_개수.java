package com.example.algorithm.programmers.basic;

public class P12916_문자열_내_p와_y의_개수 {
    public static void main(String[] args) {
        System.out.println(Solution.solution("pPoooyY"));
        System.out.println(Solution.solution("Pyy"));
    }

    class Solution {
        static boolean solution(String s) {
            boolean answer = true;
            int pCount = 0;
            int yCount = 0;

            for (char c : s.toLowerCase().toCharArray()) {
                if (c == 'p') {
                    pCount++;
                } else if (c == 'y') {
                    yCount++;
                }
            }

            if (pCount != yCount) {
                return false;
            } else {
                return answer;
            }
        }
    }
}
