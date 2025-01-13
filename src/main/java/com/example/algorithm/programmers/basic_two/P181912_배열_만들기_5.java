package com.example.algorithm.programmers.basic_two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P181912_배열_만들기_5 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(new String[]{"0123456789", "9876543210", "9999999999999"}, 50000, 5, 5)));
    }

    class Solution {
        public static int[] solution(String[] intStrs, int k, int s, int l) {
            List<Integer> intStrList = new ArrayList<>();

            for (String intStr : intStrs) {
                int i = Integer.parseInt(intStr.substring(s, s + l));
                if (i > k) {
                    intStrList.add(i);  //AutoBoxing되서 Integer타입으로 데이터가 들어간다.
                }
            }

            /**
             * return이 int 타입이기 때문에 UnBoxing해서 배열로 만들다.
             * 배열을 만들어 놓고 처리하는 방법도 있지만 배열의 크기가 얼마인지
             * 알 수 없는 상태에서는 List를 mapToInt()로 IntStream으로 만들고 배열로 변환하는 것이
             * 성능상 차이도 미미하고 가독성이 더 좋기 때문에 mapToInt()를 사용한다.
             */

            return intStrList.stream().mapToInt(i -> i).toArray();
        }
    }
}
