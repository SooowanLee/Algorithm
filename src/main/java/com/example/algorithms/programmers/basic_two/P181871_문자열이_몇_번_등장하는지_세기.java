package com.example.algorithms.programmers.basic_two;

public class P181871_문자열이_몇_번_등장하는지_세기 {
    public static void main(String[] args) {
        System.out.println(Solution.solution("banana", "ana"));
        System.out.println(Solution.solution("aaaa", "aa"));
    }

    class Solution {
        public static int solution(String myString, String pat) {
            int answer = 0;

            /*for (int i = 0; i <= myString.length() - pat.length(); i++) {
                if (myString.substring(i, i + pat.length()).equals(pat)) {
                    answer++;
                }
            }*/

            for (int i = 0; i < myString.length(); i++) {

                //이부분이 핵심!!
                //my_string에서 i번부터 my_string 끝까지 문자열을 자르고
                //startWith(pat)를 사용해서 pat으로 시작하는지 확인
                if (myString.substring(i).startsWith(pat)) {
                    answer++;
                }
            }

            return answer;
        }
    }
}
