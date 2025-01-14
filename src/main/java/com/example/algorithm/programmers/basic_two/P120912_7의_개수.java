package com.example.algorithm.programmers.basic_two;

public class P120912_7의_개수 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(new int[]{7, 77, 17}));
        System.out.println(Solution.solution(new int[]{10, 29}));
    }

    /**
     * 7을 찾기만하면 되기 때문에
     * 문자열을 문자로 쪼개서 7의 개수를 센다.
     */
    class Solution {
        public static int solution(int[] array) {
            int answer = 0; //7의 개수를 저장할 변수

            //배열의 모든 원소를 순회
            for (int num : array) {
                String numStr = String.valueOf(num); //숫자를 문자열로 변환

                //문자열을 순회하며 '7'의 개수를 셈
                for (char c : numStr.toCharArray()) {
                    if (c == '7') {
                        answer++;
                    }
                }
            }

            return answer;

            //Stream API를 사용한 풀이
           /* return (int) Arrays.stream(Arrays.stream(array)
                            .mapToObj(String::valueOf)
                            .collect(Collectors.joining())
                            .split(""))
                    .filter(s -> s.equals("7"))
                    .count();*/

        }
    }

}
