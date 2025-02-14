package com.example.algorithms.programmers.basic;

/**
 * 수 조작하기 1
 */
public class P181926 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(0, "wsdawsdassw"));
    }

    class Solution {
        public static int solution(int n, String control) {
            int answer = n;

            for (char c : control.toCharArray()) {

                switch (c) {
                    case 'w':
                        answer++;
                        break;
                    case 's':
                        answer--;
                        break;
                    case 'd':
                        answer += 10;
                        break;
                    case 'a':
                        answer -= 10;
                        break;
                }
            }

            return answer;
        }
    }
}






