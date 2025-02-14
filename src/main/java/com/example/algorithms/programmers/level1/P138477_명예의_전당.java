package com.example.algorithms.programmers.level1;

import java.util.*;

public class P138477_명예의_전당 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(3, new int[]{10, 100, 20, 150, 1, 100, 200})));
        System.out.println(Arrays.toString(Solution.solution(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000})));
    }

    class Solution {
        public static int[] solution(int k, int[] score) {
            int[] answer = new int[score.length];
            List<Integer> list = new ArrayList<>();


            /**
             * 리스트 사용
             * 1. score를 돌면서 list에 하나씩 추가
             * 2. list의 개수가 k를 넘는 순간 마지막 index 제거
             * 3. answer에 list의 마지막 index(최하위 점수) 저장
             */
            for (int i = 0; i < score.length; i++) {
                list.add(score[i]); // 명예의 전당에 점수 추가
                Collections.sort(list, Collections.reverseOrder()); // 내림차순 정렬

                if (list.size() > k) {
                    list.remove(list.size() - 1); // k개 넘으면 최하위 점수 제거
                }

                answer[i] = list.get(list.size() - 1); // 최하위 점수 저장
            }


            //Queue
            Queue<Integer> queue = new PriorityQueue<>();
            for (int i = 0; i < score.length; i++) {
                queue.add(score[i]);

                if (queue.size() > k) {
                    queue.poll();
                }

                answer[i] = queue.peek();
            }

            return answer;
        }
    }
}
