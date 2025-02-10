package com.example.algorithm.programmers.level2;

import java.util.Stack;

public class P76502_괄호_회전하기 {
    public static void main(String[] args) {
        System.out.println(Solution.solution("[](){}"));
        System.out.println(Solution.solution("}]()[{"));
        System.out.println(Solution.solution("[)(]"));
        System.out.println(Solution.solution("}}}"));
    }

    class Solution {
        public static int solution(String s) {
            int answer = 0;

            for (int i = 0; i < s.length(); i++) {
                if (isCorrect(s)) { // 올바른 괄호 문자열인지 확인
                    answer++;
                }
                s = rotate(s); // 왼쪽으로 한 칸 회전
            }

            return answer;
        }

        public static boolean isCorrect(String s) {
            Stack<Character> stack = new Stack<>();

            for (char c : s.toCharArray()) {
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        return false; // 닫는 괄호가 먼저 나오는 경우
                    }

                    char top = stack.pop();

                    if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '{' && top != '}')) {
                        return false; // 괄호 짝이 맞지 않는 경우
                    }
                }
            }

            return stack.isEmpty(); // 스택이 비어있어야 올바른 괄호 문자열
        }

        // 문자열을 왼쪽으로 한 칸 회전시키는 함수
        public static String rotate(String s) {
            return s.substring(1) + s.charAt(0);
        }
    }
}
