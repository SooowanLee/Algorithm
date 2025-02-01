package com.example.algorithm.programmers.level2;

import java.util.Stack;

public class P12909_올바른_괄호 {
    public static void main(String[] args) {
        System.out.println(Solution.solution("()()"));
        System.out.println(Solution.solution("(())()"));
        System.out.println(Solution.solution(")()("));
        System.out.println(Solution.solution("(()("));

        System.out.println(Solution.solution2("()()"));
        System.out.println(Solution.solution2("(())()"));
        System.out.println(Solution.solution2(")()("));
        System.out.println(Solution.solution2("(()("));
    }

    class Solution {
        
        // Stack없는 풀이
        static boolean solution(String s) {
            boolean answer = false;
            int count = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    count++;
                }

                if (s.charAt(i) == ')') {
                    count--;
                }

                if (count < 0) {
                    break;
                }
            }

            if (count == 0) {
                answer = true;
            }

            return answer;
        }

        static boolean solution2(String s) {
            boolean answer = false;
            Stack<Character> st = new Stack<>();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                // 여는 괄호
                if (c == '(') {
                    st.push(c);
                }

                // 닫는 괄호
                if (c == ')') {
                    if (st.isEmpty()) {
                        return answer;
                    } else {
                        st.pop();
                    }
                }

                if (st.size() == 0) {
                    answer = true;
                }
            }

            return answer;
        }
    }
}
