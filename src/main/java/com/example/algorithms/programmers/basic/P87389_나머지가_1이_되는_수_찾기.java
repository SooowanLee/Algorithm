package com.example.algorithms.programmers.basic;

public class P87389_나머지가_1이_되는_수_찾기 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(10));
        System.out.println(Solution.solution(12));
    }

    class Solution {
        public static int solution(int n) {
            int answer = 1;

            //while문을 사용한 풀이
            while (n % answer != 1) { //n을 answer로 나눠서 1이 되면 while문 탈출
                answer++;
            }

            //for문을 사용한 풀이
            /*for (int i = 2; i < n; i++) {
                if (n % i == 1) { //n % i가 되는 첫번째 숫자를 찾기 위해 break를 건다.
                    answer = i;
                    break;
                }
            }*/

            return answer;
        }
    }
}
