package com.example.algorithms.programmers.basic;

/**
 * 홀짝에 따라 다른 값 반환하기
 * 양의 정수 n이 매개변수로 주어질 때, n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return
 * n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return
 */
public class P181935 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(10));
    }

    class Solution {
        public static int solution(int n) {
            int answer = 0;

            //i가 n부터 시작해서 2씩 빠지면서 홀, 짝을 구분하는 법
            for (int i = n; i > 0; i -= 2) {
                answer += (n % 2 == 0) ? i * i : i;
            }

            //i를 2씩 증가하며 홀,짝을 구분하는 법
            /*if (n % 2 == 0) {
                for (int i = 2; i <= n; i += 2) {
                    answer += i * i;
                }
            } else {
                for (int i = 1; i <= n; i += 2) {
                    answer += i;
                }
            }*/

            return answer;
        }
    }
}
