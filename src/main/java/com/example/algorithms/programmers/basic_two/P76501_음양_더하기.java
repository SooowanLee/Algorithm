package com.example.algorithms.programmers.basic_two;

public class P76501_음양_더하기 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(new int[]{4, 7, 12}, new boolean[]{true, false, true}));
        System.out.println(Solution.solution(new int[]{1, 2, 3}, new boolean[]{false, false, true}));
    }


    class Solution {
        public static int solution(int[] absolutes, boolean[] signs) {
            int answer = 0;

            //sign이 참이면 absolutes[i]을 더한다.
            //false면 absolutes[i]를 음수로 바꿔서 더한다.
            for (int i = 0; i < absolutes.length; i++) {
                if (signs[i] == true) {
                    answer += absolutes[i];
                } else {
                    answer += (-absolutes[i]);
                }
            }


            //삼항연산자를 사용한 풀이
            for (int i = 0; i < signs.length; i++) {
                 answer += absolutes[i] * (signs[i] ? 1 : -1); //참이면 양수, 거짓이면 음수를 곱해서 양수, 음수를 만든다.
            }

            return answer;
        }
    }
}
