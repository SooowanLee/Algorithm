package com.example.algorithms.programmers.basic;

/**
 * 부분 문자열 이어 붙여 문자열 만들기
 */
public class P181911 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(new String[]{"progressive", "hamburger", "hammer", "ahocorasick"},
                new int[][]{
                        {0, 4},
                        {1, 2},
                        {3, 5},
                        {7, 7}
                }));
    }

    /**
     * my_string배열에서 인덱스를 돌면서 문자를 추출
     * parts배열을 순회하면서 String.substring(start, end)를 사용해서 my_string에서 추출한 문자열의 부분 문자열을 추출
     * subString의 end는 인덱스로 작동하기 때문에 parts[i][1]에서 추출한 숫자대로 작동하게 하려면 end+1을 해준다.
     */
    class Solution {
        public static String solution(String[] my_strings, int[][] parts) {
            StringBuilder answer = new StringBuilder();

            for (int i = 0; i < my_strings.length; i++) {

                int start = parts[i][0];
                int end = parts[i][1];

                answer.append(my_strings[i].substring(start, end + 1));
            }


            return answer.toString();
        }
    }
}
