package com.example.algorithms.programmers.basic;

/**
 * 두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때,
 * flag가 true면 a + b를 false면 a - b를 return
 */
public class P181933 {
    public static void main(String[] args) {

        System.out.println(Solution.solution(-4, 7, false));
    }

    class Solution {
        public static int solution(int a, int b, boolean flag) {
            return flag ? a + b : a - b;
        }
    }
}
