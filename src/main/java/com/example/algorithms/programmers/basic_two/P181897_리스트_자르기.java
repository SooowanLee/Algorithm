package com.example.algorithms.programmers.basic_two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class P181897_리스트_자르기 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(3, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})));
        System.out.println(Arrays.toString(Solution.solution(4, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})));
    }

    class Solution {
        public static int[] solution(int n, int[] slicer, int[] num_list) {
            List<Integer> answerList = new ArrayList<>();


            switch (n) {
                case 1:
                    return Arrays.copyOfRange(num_list, 0, slicer[1] + 1);
                case 2:
                    return Arrays.copyOfRange(num_list, slicer[0], num_list.length);
                case 3:
                    return Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
                case 4:
                    return IntStream.rangeClosed(slicer[0], slicer[1])
                            .filter(i -> (i - slicer[0]) % 2 == 0)
                            .map(i -> num_list[i])
                            .toArray();
                default: //위 case에 해당하지 않으면 빈 배열 반환
                    return new int[0];
            }

            //Stream API를 사용하지 않을 때 풀이
           /* int[] answer = new int[answerList.size()];
            for (int i = 0; i < answerList.size(); i++) {
                answer[i] = answerList.get(i);
            }

            return answer;*/
        }
    }
}
