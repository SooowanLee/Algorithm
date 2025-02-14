package com.example.algorithms.programmers.basic;

public class P181900_글자_지우기 {
    public static void main(String[] args) {
        System.out.println(Solution.solution("apporoograpemmemprs", new int[]{1, 16, 6, 15, 0, 10, 11, 3}));
    }


    /**
     * Set은 중복 허용X
     * indices을 set에 저장
     * my_string을 돌면서 set에 저장되지 않은 index는 StringBuilder를 사용해서 문자열을 연결후 String으로 변환
     * String의 특성상 불변객체로 새로운 메모리에 문자열을 저장하기 때문에
     * String을 직접 고치거나 String을 이어 붙이는 것은 메모리 낭비가 심하다
     */
    class Solution {
        public static String solution(String my_string, int[] indices) {
//            StringBuilder sb = new StringBuilder();

            //Set을 사용한 풀이
           /* Set<Integer> indexSet = new HashSet<>();

            for (int index : indices) {
                indexSet.add(index);
            }

            for (int i = 0; i < my_string.length(); i++) {
                if (!indexSet.contains(i)) {
                    sb.append(my_string.charAt(i));
                }
            }

            return sb.toString();*/

            /**
             * StringBuilder.setCharAt(int index, char ch)는 인덱스의 문자를 새로운 문자로 변환할 수 있다.
             * String.replace(char oldChar. char newChar)로 빈 문자로 변환시켰던 index를 지워준다.
             */
            StringBuilder sb = new StringBuilder(my_string);
            for (int index: indices) {
                sb.setCharAt(index, ' ');
            }

            return sb.toString().replace(" ", "");
        }
    }
}
