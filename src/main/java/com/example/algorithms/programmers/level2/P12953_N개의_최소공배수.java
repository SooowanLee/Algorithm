package com.example.algorithms.programmers.level2;

public class P12953_N개의_최소공배수 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(new int[]{2, 6, 8, 14}));
        System.out.println(Solution.solution(new int[]{1, 2, 3}));
    }

    class Solution {
        public static int solution(int[] arr) {
            int answer = arr[0];

            for (int i = 1; i < arr.length; i++) {
                answer = lcm(answer, arr[i]);
            }

            return answer;
        }

        // 최대 공약수(유클리드 알고리즘)
        public static int gcd(int a, int b) {
            //b가 0이 될 때까지 a와 b의 값을 갱신
            while (b != 0) {
                int temp = b; // 나머지 저장
                b = a % b; // 나머지로 a를 나누기
                a = temp; // b를 a위치로 이동
            }

            return a;
        }

        // 두 수 a와 b의 최소공배수(LCM)를 구하는 메서드
        // LCM(a, b) = (a * b) / gcd(a, b)
        public static int lcm(int a, int b) {
            return a * b / gcd(a, b);
        }
    }
}
