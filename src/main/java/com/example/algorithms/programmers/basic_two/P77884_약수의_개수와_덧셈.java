package com.example.algorithms.programmers.basic_two;

public class P77884_약수의_개수와_덧셈 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(13, 17));
        System.out.println(Solution.solution(24, 27));
    }

    class Solution {
        public static int solution(int left, int right) {
            int answer = 0;

            //제곱수를 사용한 풀이
            /*for (int i = left; i <= right; i++) {
                //제곱근이 정수인지 확인하여 제곱수 여부 판단
                if (Math.sqrt(i) == (int) Math.sqrt(i)) {
                    answer -= i;    //제곱수(약수 개수 홀수)는 빼기
                } else {
                    answer += i;    //제곱수가 아닌 수(약수 개수 짝수)는 더하기
                }
            }*/


            for (int i = left; i <= right; i++) {
                answer += i * (countDenominators(i) % 2 == 0 ? 1 : -1);
            }

            return answer;
        }

        private static int countDenominators(int num) {
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) { //약수 구하기
                    count++; //약수의 개수
                }
            }

            return count;
        }
    }
}
