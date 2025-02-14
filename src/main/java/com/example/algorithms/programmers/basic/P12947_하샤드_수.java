package com.example.algorithms.programmers.basic;

public class P12947_하샤드_수 {

    public static void main(String[] args) {
        System.out.println(Solution.solution(10));
        System.out.println(Solution.solution(12));
        System.out.println(Solution.solution(11));
        System.out.println(Solution.solution(13));
    }

    /**
     * n을 정수 배열로 변환
     * 각 배열을 더한 뒤
     * 더해진 배열의 값이 x로 나눠지지 않으면 false
     */
    class Solution {
        public static boolean solution(int x) {
            boolean answer = true;
            int[] nArr = String.valueOf(x).chars().map(Character::getNumericValue).toArray();
            int sum = 0 ;

            for (int i : nArr) {
                sum += i;
            }

            if (x % sum != 0) {
                return false;
            }

            return answer;
        }
    }
}
