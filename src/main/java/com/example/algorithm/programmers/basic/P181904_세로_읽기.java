package com.example.algorithm.programmers.basic;

public class P181904_세로_읽기 {
    public static void main(String[] args) {
        System.out.println(Solution.solution("ihrhbakrfpndopljhygc", 4, 2));
        System.out.println(Solution.solution("programmers", 1, 1));
    }

    /**
     * my_string을 순회하면서 i % m이 c-1(인덱스는 0부터 시작)이면
     * StrintBuilder에 추가
     */
    class Solution {
        public static String solution(String my_string, int m, int c) {
            StringBuilder sb = new StringBuilder();

          /*  for (int i = 0; i < my_string.length(); i++) {
                if (i % m == c - 1) { //c 번째에 있는지 확인(인덱스는 0부터 시작하므로  c-1)
                    sb.append(my_string.charAt(i));
                }
            }*/

            //c열부터 시작해서 4씩 증가하면서 읽기
            for (int i = c -1; i < my_string.length(); i += m) {
                sb.append(my_string.charAt(i));
            }

            return sb.toString();
        }
    }
}
