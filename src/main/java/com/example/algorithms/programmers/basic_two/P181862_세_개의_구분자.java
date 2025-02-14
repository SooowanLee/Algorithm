package com.example.algorithms.programmers.basic_two;

import java.util.Arrays;

public class P181862_세_개의_구분자 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution("baconlettucetomato")));
        System.out.println(Arrays.toString(Solution.solution("abcd")));
        System.out.println(Arrays.toString(Solution.solution("cabab")));
    }

    class Solution {
        public static String[] solution(String myStr) {
           /* String[] parts = myStr.split("[abc]");

            List<String> result = new ArrayList<>();
            for (String part : parts) {
                if (!part.isEmpty()) {
                    result.add(part);
                }
            }

            if (result.isEmpty()) {
                return new String[]{"EMPTY"};
            }

            return result.toArray(new String[0]);*/

            //Stream API를 사용한 풀이
            String[] result = Arrays.stream(myStr.split("[abc]"))
                    .filter(s -> !s.isEmpty())
                    .toArray(String[]::new);

            return result.length == 0 ? new String[]{"EMPTY"} : result;
        }
    }
}
