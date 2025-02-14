package com.example.algorithms.programmers.basic_two;

public class P12948_핸드폰_번호_가리기 {
    public static void main(String[] args) {
        System.out.println(Solution.solution("01033334444"));
        System.out.println(Solution.solution("027778888"));
    }

    class Solution {
        public static String solution(String phone_number) {
            //StringBuilder 사용한 방법
            StringBuilder sb = new StringBuilder();
            String substring = phone_number.substring(phone_number.length() - 4);

            for (int i = 0; i < phone_number.length() - 4; i++) {
                sb.append("*");
            }
            sb.append(substring);

            return sb.toString();

            //고전적인 방법
//            char[] charArray = phone_number.toCharArray();
//            for (int i = 0; i < charArray.length - 4; i++) {
//                charArray[i] = '*';
//            }
//
//            return String.valueOf(charArray);
        }
    }
}
