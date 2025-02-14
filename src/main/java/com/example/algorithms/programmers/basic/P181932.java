package com.example.algorithms.programmers.basic;

/**
 * 코드 처리하기
 */
public class P181932 {
    public static void main(String[] args) {
        System.out.println(Solution.solution("abc1abc1abc")); // 예시 입력
        System.out.println(Solution.solution("123456789"));   // 예시 입력
        System.out.println(Solution.solution("1a1b1c1d"));   // 예시 입력
        System.out.println(Solution.solution(""));           // 예시 입력
    }

    class Solution {
        public static String solution(String code) {
            StringBuilder result = new StringBuilder();
            int mode = 0;

            for (int idx = 0; idx < code.length(); idx++) {
                char currentChar = code.charAt(idx);

                if (currentChar == '1') {
                    mode = 1 - mode;
                } else {
                    if (mode == 0 && idx % 2 == 0) {
                        result.append(currentChar);
                    } else if (mode == 1 && idx % 2 != 0) {
                        result.append(currentChar);
                    }
                }
            }

            return result.length() > 0 ? result.toString() : "EMPTY";
        }
    }
}