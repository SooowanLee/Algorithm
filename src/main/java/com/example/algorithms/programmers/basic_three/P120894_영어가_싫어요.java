package com.example.algorithms.programmers.basic_three;

public class P120894_영어가_싫어요 {
    public static void main(String[] args) {
        System.out.println(Solution.solution("onetwothreefourfivesixseveneightnine"));
        System.out.println(Solution.solution("onefourzerosixseven"));
    }

    class Solution {
        public static long solution(String numbers) {
            String[] numStr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//            Map<String, String> numstrMap = new HashMap<>();

          /*  for (int i = 0; i < numStr.length; i++) {
                numstrMap.put(numStr[i], String.valueOf(i));

            }

            for (Map.Entry<String, String> entry : numstrMap.entrySet()) {
                numbers = numbers.replace(entry.getKey(), entry.getValue());
            }*/

            //배열과 for문을 사용
            for (int i = 0; i < numStr.length; i++) {
                numbers = numbers.replaceAll(numStr[i], String.valueOf(i)); //등장하는 모든 one, two, three.. 등을 치환한다.
            }

            return Long.parseLong(numbers);
        }
    }
}
