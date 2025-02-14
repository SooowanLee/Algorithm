package com.example.algorithms.programmers.basic_two;

public class P181872_특정_문자열로_끝나는_가장_긴_부분_문자열_찾기 {

    public static void main(String[] args) {
        System.out.println(Solution.solution("AbCdEFG", "dE"));
        System.out.println(Solution.solution("AAAAaaaa", "a"));
    }

    class Solution {
        public static String solution(String myString, String pat) {
            String answer = "";

            /*for (int i = myString.length(); i > 0; i--) {
                String sub = myString.substring(0, i);
                if (sub.endsWith(pat)) {
                    answer = sub;
                    break; //가장 긴 문자열을 찾았으면 for문 종료
                }
            }*/

            int findPat = myString.lastIndexOf(pat);
//            answer = myString.substring(0, findPat) + pat; //마지막 인덱스까지 자른 문자와 찾는 문자 더하기
            answer = myString.substring(0, findPat + pat.length()); //마지막 인덱스 + 찾는 문자의 길이 = 특정 문자열로 끝나는 가장 긴 부분 문자열

            return answer;
        }
    }
}
