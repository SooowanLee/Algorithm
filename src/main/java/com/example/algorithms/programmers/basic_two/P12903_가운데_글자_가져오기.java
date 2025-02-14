package com.example.algorithms.programmers.basic_two;

public class P12903_가운데_글자_가져오기 {
    public static void main(String[] args) {
        System.out.println(Solution.solution("abcde"));
        System.out.println(Solution.solution("qwer"));
    }


    //가운데를 찾기 위해 2로 나눈다.
    class Solution {
        public static String solution(String s) {
            String answer = "";
            int i = s.length() / 2;

            if (s.length() % 2 == 0) {
                answer = s.substring(i-1, i+1);
            } else {
                answer = s.substring(i, i+1);
            }

            return answer;
        }
    }
}
