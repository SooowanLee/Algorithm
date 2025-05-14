package com.example.algorithms.programmers.level3;

import java.util.ArrayDeque;
import java.util.Queue;

public class P118667_두_큐_합_같게_만들기 {

    public static void main(String[] args) {
        System.out.println(Solution.solution(new int[]{3, 2, 7, 2}, new int[]{4, 6, 5, 1}));
        System.out.println(Solution.solution(new int[]{1, 2, 1, 2}, new int[]{1, 10, 1, 2}));
        System.out.println(Solution.solution(new int[]{1, 1}, new int[]{1, 5}));
    }


    class Solution {
        public static int solution(int[] queue1, int[] queue2) {
            int answer = -2;

            Queue<Integer> q1 = new ArrayDeque<>();
            Queue<Integer> q2 = new ArrayDeque<>();

            int sum1 = 0; // q1의 합
            int sum2 = 0; // q2의 합

            for (int num : queue1) {
                q1.offer(num);
                sum1 += num;
            }

            for (int num : queue2) {
                q2.offer(num);
                sum2 += num;
            }

            int totalSum = sum1 + sum2;

            // 총합이 홀수면 둘로 나눌 수 없음
            if (totalSum % 2 != 0) {
                return -1;
            }

            answer = 0; // 작업 횟수
            int maxCount = (queue1.length + queue2.length) * 2; // 최대 이동 횟수 제한(무한루프 방지)


            while (sum1 != sum2) {

                // 작업을 너무 많이 했다면(무한 루프 방지)
                if (answer > maxCount) {
                    return -1;
                }

                // sum1이 더 크다면 q1에서 pop해서 q2에 넣는다.
                if (sum1 > sum2) {
                    Integer num = q1.poll(); // q1의 맨 앞 요소 꺼내기
                    sum1 -= num; // q1 합 감소
                    sum2 += num; // q2 합 증가
                    q2.offer(num); // q2에 추가
                } else {
                    Integer num = q2.poll();
                    sum2 -= num;
                    sum1 += num;
                    q1.offer(num);
                }

                answer++;
            }

            return answer;
        }
    }
}


