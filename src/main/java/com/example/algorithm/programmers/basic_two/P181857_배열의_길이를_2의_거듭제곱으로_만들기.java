package com.example.algorithm.programmers.basic_two;

import java.util.Arrays;

public class P181857_배열의_길이를_2의_거듭제곱으로_만들기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(new int[]{1, 2, 3, 4, 5, 6})));
        System.out.println(Arrays.toString(Solution.solution(new int[]{58, 172, 746, 89})));
    }

    //배열은 기본적으로 초기화가 0으로 되어있다.
    //새로운 배열의 크기를 최소한의 0을 추가한 2의 거듭 제곱으로 잡으로 자연스럽게 뒤에 0이 붙은 형태가 된다.
    class Solution {
        public static int[] solution(int[] arr) {
            //풀이1
            int len = arr.length;
            int targetLen = 1; //새로운 배열의 크기

            while (targetLen < arr.length) { //배열의 길이와 같거나 클때까지
                targetLen *= 2; //2의 거듭제곱
            }

            int[] answer = new int[targetLen];
            System.arraycopy(arr,0, answer, 0, len);

            return answer;

            //Arrays.copy()를 사용한 풀이
           /* int length = 1;

            while (length < arr.length) {
                length *= 2;
            }

            return Arrays.copyOf(arr, length);*/
        }
    }
}
