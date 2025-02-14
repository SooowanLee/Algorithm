package com.example.algorithms.programmers.basic_two;

public class P181905_문자열_뒤집기 {
    public static void main(String[] args) {
        System.out.println(Solution.solution("Progra21Sremm3", 6, 12));
        System.out.println(Solution.solution("Stanley1yelnatS", 4, 10));
    }

    class Solution {

        //StringBuilder는 하나의 StringBuilder객체가 공유되기 때문에 따로 만들어서 붙여준다.
        public static String solution(String my_string, int s, int e) {
            /*//StringBuilder를 사용한 방법
            StringBuilder sb = new StringBuilder(my_string);
            StringBuilder reversedPart = new StringBuilder(sb.substring(s, e + 1)).reverse();

            sb.replace(s, e + 1, reversedPart.toString());

            return sb.toString();*/

            //char 배열을 이용한 방법
            char[] charArray = my_string.toCharArray();

            //s와e를 바꾸면서 안쪽으로 들어간다.
            while (s < e) {
                char temp = charArray[s];
                charArray[s] = charArray[e];
                charArray[e] = temp;
                s++;
                e--;
            }

            return new String(charArray);
        }
    }
}
