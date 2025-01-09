package com.example.algorithm.programmers.basic_two;

public class P12919_서울에서_김서방_찾기 {

    public static void main(String[] args) {
        System.out.println(Solution.solution(new String[]{"Jane", "Kim"}));
    }

    class Solution {
        public static String solution(String[] seoul) {
            String answer = "";

            for (int i = 0; i < seoul.length; i++) {
                if (seoul[i].equals("Kim")) {
                    return "김서방은 " + i + "에 있다";
                }
            }

            return answer;
        }
    }
}
