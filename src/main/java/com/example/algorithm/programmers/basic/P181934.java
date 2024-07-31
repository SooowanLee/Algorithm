package com.example.algorithm.programmers.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiPredicate;

/**
 * 조건 문자열
 * 두 수가 n과 m이라면
 * ">", "=" : n >= m
 * "<", "=" : n <= m
 * ">", "!" : n > m
 * "<", "!" : n < m
 * 두 문자열 ineq와 eq가 주어집니다. ineq는 "<"와 ">"중 하나고, eq는 "="와 "!"중 하나입니다.
 * 그리고 두 정수 n과 m이 주어질 때, n과 m이 ineq와 eq의 조건에 맞으면 1을 아니면 0을 return
 */
public class P181934 {
    public static void main(String[] args) {
        System.out.println(Solution.solution("<", "=", 20, 50));
    }

    class Solution {
        public static int solution(String ineq, String eq, int n, int m) {
            int answer = 0;

            //람다-스트림
            Map<String, BiPredicate<Integer, Integer>> conditions = new HashMap<>();

            conditions.put(">=", (a, b) -> a >= b);
            conditions.put("<=", (a, b) -> a <= b);
            conditions.put(">!", (a, b) -> a < b);
            conditions.put("<!", (a, b) -> a < b);

            String condition = ineq + eq;

            return conditions.getOrDefault(condition, (a, b) -> false).test(n, m) ? 1 : 0;


            //if문
            /*if (ineq.equals("<") && eq.equals("=")) {
                answer = n <= m ? 1 : 0;
            }
            if (ineq.equals(">") && eq.equals("=")) {
                answer = n >= m ? 1 : 0;
            }
            if (ineq.equals("<") && eq.equals("!")) {
                answer = n < m ? 1 : 0;
            }
            if (ineq.equals(">") && eq.equals("!")) {
                answer = n > m ? 1 : 0;
            }*/

            //switch-case
            /*switch (condition) {
                case ">=":
                    answer = n >= m ? 1 : 0;
                    break;
                case "<=":
                    answer = n <= m ? 1 : 0;
                    break;
                case ">!":
                    answer =  n > m ? 1 : 0;
                    break;
                case "<!":
                    answer =  n < m ? 1 : 0;

            }*/

//            return answer;

        }
    }
}
