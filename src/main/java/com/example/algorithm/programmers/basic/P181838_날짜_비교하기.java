package com.example.algorithm.programmers.basic;

import java.util.Arrays;

public class P181838_날짜_비교하기 {

    public static void main(String[] args) {
        System.out.println(Solution.solution(new int[]{2021, 12, 28}, new int[]{2021, 12, 29}));
        System.out.println(Solution.solution(new int[]{1024, 10, 24}, new int[]{1024, 10, 24}));
    }

    class Solution {
        public static int solution(int[] date1, int[] date2) {
            
            //Arrays.compare를 사용한 풀이
            /**
             * Arrays.compare(a,b) = a가 b보다 작다면 -1 크다면 1 같으면 0을 반환
             * date1이 date2보다 작으면 -1을 반환
             * compare이 -1이기 때문에 1을 반환 
             * 만약 date1이 크면 1이기 때문에 0보다 작지 않아서 0을 반환
             */
            int compare = Arrays.compare(date1, date2);
            return compare < 0 ? 1 : 0;
            
            //LocalDate를 사용한 풀이
            /*LocalDate d1 = LocalDate.of(date1[0], date1[1], date1[2]);
            LocalDate d2 = LocalDate.of(date2[0], date2[1], date2[2]);

            return d1.isBefore(d2) ? 1 :0;*/
        }
    }
}
