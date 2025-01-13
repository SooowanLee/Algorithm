package com.example.algorithm.programmers.basic_two;

public class P120887_k의_개수 {

    public static void main(String[] args) {
        System.out.println(Solution.solution(1, 13, 1));
        System.out.println(Solution.solution(10, 50, 5));
        System.out.println(Solution.solution(3, 10, 2));
    }

    class Solution {
        public static int solution(int i, int j, int k) {
            /*int answer = 0;

            //i부터 j까지 모든 숫자를 순회하면서 count++
            for (int num = i; num <= j; num++) {
                String strNum = String.valueOf(num); //숫자를 문자열로 변환
                for (int index = 0; index < strNum.length(); index++) {
                    if (strNum.charAt(index) - '0' == k) { //문자 하나하나 비교
                        answer++;
                    }
                }
            }

            return answer;*/

            //개선된코드1: contains()메서드 활용
            //k가 포함이 되어 있는 숫자만 순회하면서 count
         /*   int count = 0;
            String kStr = String.valueOf(k); //k를 문자열로 미리 변환
            for (int num = i; num <= j; num++) {
                String strNum = String.valueOf(num);
                if (strNum.contains(kStr)) { //k가 포함되어 있는지 확인
                    for (int index = 0; index < strNum.length(); index++) {
                        if (strNum.charAt(index) - '0' == k) {
                            count++;
                        }
                    }
                }
            }

            return count;*/

            //String.replaceALL() 메서드 활용
            int count = 0;

            String kStr = String.valueOf(k);
            for (int num = i; num <= j; num++) {
                String strNum = String.valueOf(num);
                count += strNum.length() - strNum.replaceAll(kStr, "").length();
            }

            return count;
        }
    }
}
