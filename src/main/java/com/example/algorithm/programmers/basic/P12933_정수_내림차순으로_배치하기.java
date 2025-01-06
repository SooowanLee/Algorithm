package com.example.algorithm.programmers.basic;

import java.util.Arrays;

public class P12933_정수_내림차순으로_배치하기 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(118372));
    }
    class Solution {
        public static long solution(long n) {
            //풀이1
//            String s = String.valueOf(n);
//            List<Character> collect = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
//
//            Collections.sort(collect, Collections.reverseOrder());
//
//            StringBuilder sb = new StringBuilder();
//            for (Character character : collect) {
//                sb.append(character);
//            }
//
//            return Long.parseLong(sb.toString());

            //풀이2
            String[] list = String.valueOf(n).split(""); //n을 String으로 변환 split으로 배열을 만든 후

            Arrays.sort(list);  //오름차순정렬

            StringBuilder sb = new StringBuilder(); //String을 이어붙이기 위해 StrigBuilder 사용
            for (String s : list) {
                sb.append(s);   //list를 순회하면서 sb로 String을 붙인다.
            }

            //long 타입으로 반환하기 위해 parseLong()을 사용
            //배열을 내림차순으로 반환하기위해 reverse해준다.
            return Long.parseLong(sb.reverse().toString());


            //Stream을 사용한 풀이
           /* return Long.parseLong(String.valueOf(n).chars()
                    .mapToObj(String::valueOf)
                    .sorted(Collections.reverseOrder())
                    .collect(Collectors.joining()));*/
        }
    }
}
