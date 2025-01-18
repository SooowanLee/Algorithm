package com.example.algorithm.programmers.basic_two;

public class P181837_커피_심부름 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(new String[]{"cafelatte", "americanoice", "hotcafelatte", "anything"}));
        System.out.println(Solution.solution(new String[]{"americanoice", "americano", "iceamericano"}));
    }

    class Solution {
        public static int solution(String[] order) {
            int answer = 0;

            for (String o : order) {
                if (o.contains("americano")) {
                    answer += 4500;
                } else if (o.contains("cafelatte")) {
                    answer += 5000;
                } else if (o.equals("anything")) {
                    answer += 4500;
                }
            }

            return answer;
        }
    }
}
