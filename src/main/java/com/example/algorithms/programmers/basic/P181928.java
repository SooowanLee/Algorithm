package com.example.algorithms.programmers.basic;

import java.util.Arrays;
import java.util.stream.Collectors;

public class P181928 {
    /**
     * 정수가 담긴 리스트 num_list가 주어집니다.
     * num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return
     */

    public static void main(String[] args) {
        System.out.println(Solution.solution(new int[]{3, 4, 5, 2, 1}));
        System.out.println(Solution.solution(new int[]{5, 7, 8, 3}));

        System.out.println(Solution.solution2(new int[]{3, 4, 5, 2, 1}));
        System.out.println(Solution.solution2(new int[]{5, 7, 8, 3}));

        System.out.println(Solution.solution3(new int[]{3, 4, 5, 2, 1}));
        System.out.println(Solution.solution3(new int[]{5, 7, 8, 3}));
    }


    class Solution {

        //StringBuilder를 사용한 풀이
        public static int solution(int[] num_list) {
            int answer = 0;

            StringBuilder oddString = new StringBuilder();
            StringBuilder evenString = new StringBuilder();

            for (int num : num_list) {
                if (num % 2 != 0) {
                    oddString.append(num);
                } else {
                    evenString.append(num);
                }
            }

            int oddNumber = Integer.parseInt(oddString.toString());
            int evenNumber = Integer.parseInt(evenString.toString());

            answer = oddNumber + evenNumber;

            return answer;
        }


        //StreamAPI를 사용한 방법
        public static int solution2(int[] num_list) {
            int answer = 0;

            String oddNumber = Arrays.stream(num_list)
                    .filter(num -> num % 2 != 0)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining());

            String evenNumber = Arrays.stream(num_list)
                    .filter(num -> num % 2 ==0)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining());

            answer = Integer.parseInt(oddNumber) + Integer.parseInt(evenNumber);

            return answer;
        }

        //삼항연산자
        public static int solution3(int[] num_list) {
            int answer = 0;
            StringBuilder oddNumber = new StringBuilder();
            StringBuilder evenNumber = new StringBuilder();

            for (int num : num_list) {
                (num % 2 != 0 ? oddNumber : evenNumber).append(num);
            }

            answer = Integer.parseInt(oddNumber.toString()) + Integer.parseInt(evenNumber.toString());

            return answer;
        }
    }
}
