package com.example.algorithms.programmers.basic_two;

import java.util.Arrays;

public class P181902_문자_개수_세기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution("Programmers")));
    }

    //대문자가 먼저 나오기 때문에
    //소문자는 대문자가 끝나는 지점인 26다음 27번째라서
    //26을 더해준다.
    class Solution {
        public static int[] solution(String my_string) {
            int[] answer = new int[52];

            for (char c : my_string.toCharArray()) {
                if (c >= 'A' && c <= 'Z') { //대문자인 경우
                    answer[c - 'A']++;
                } else {
                    answer[c - 'a' + 26]++; //소문자인 경우
                }
            }

            return answer;
        }
    }
}
