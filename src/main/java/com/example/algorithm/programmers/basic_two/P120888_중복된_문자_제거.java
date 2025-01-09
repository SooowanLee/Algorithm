package com.example.algorithm.programmers.basic_two;

import java.util.HashSet;
import java.util.Set;

public class P120888_중복된_문자_제거 {

    public static void main(String[] args) {
        System.out.println(Solution.solution("people"));
        System.out.println(Solution.solution("We are the world"));
    }

    class Solution {
        public static String solution(String my_string) {
            //Set을 사용한 풀이
            StringBuilder sb = new StringBuilder();
            Set<Character> seen = new HashSet<>(); //이미 등장한 문자를 저장할 HashSet

            for (int i = 0; i < my_string.length(); i++) {
                char c = my_string.charAt(i);
                if (!seen.contains(c)) { //등장한적 없는 문자면
                    sb.append(c); //문자들을 추가
                    seen.add(c);   //등장한 문자 집합에 추가
                }
            }

            return sb.toString();

            //스트림을 사용한 풀이
            /*return my_string.chars()
                    .mapToObj(Character::toString)
                    .distinct()
                    .collect(Collectors.joining());*/
        }
    }
}
