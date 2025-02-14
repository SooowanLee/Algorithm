package com.example.algorithms.programmers.basic;

/**
 * 인덱스 바꾸기
 */
public class P120895 {

    public static void main(String[] args) {
        System.out.println(Solution.solution("hello", 1, 2));
        System.out.println(Solution.solution("i love you", 3, 6));
    }

    class Solution {
        public static String solution(String my_string, int num1, int num2) {
            char[] charArray = my_string.toCharArray();


            //Collection.swap을 사용한 인덱스 바꾸기
/*
            List<String> list = Arrays.stream(my_string.split("")).collect(Collectors.toList());

            Collections.swap(list, num1, num2);

            String joinList = String.join("", list);
*/


            //charAt()을 사용한 인덱스 바꾸기
            charArray[num1] = my_string.charAt(num2);
            charArray[num2] = my_string.charAt(num1);

            //변수를 사용한 인덱스 바꾸기
//            char charArrNum1 = charArray[num1];

//            charArray[num1] = charArray[num2];
//            charArray[num2] = charArrNum1;

            return String.valueOf(charArray);
        }

    }
}
