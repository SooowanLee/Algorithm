package com.example.algorithms.programmers.basic_two;

public class P181913_문자열_여러_번_뒤집기 {
    public static void main(String[] args) {
        System.out.println(Solution.solution("rermgorpsam", new int[][]{{2, 3}, {0, 7}, {5, 9}, {6, 10}}));
    }

    class Solution {
        public static String solution(String my_string, int[][] queries) {
            char[] charArray = my_string.toCharArray();

            for (int[] query : queries) {
                int s = query[0];
                int e = query[1];

                while (s < e) {
                    char temp = charArray[s];
                    charArray[s++] = charArray[e];
                    charArray[e--] = temp;
                }
            }

            return new String(charArray);
        }
    }
}
