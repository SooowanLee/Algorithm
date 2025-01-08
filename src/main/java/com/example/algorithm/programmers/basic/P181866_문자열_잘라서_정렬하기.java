package com.example.algorithm.programmers.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P181866_문자열_잘라서_정렬하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution("axbxcxdx")));
        System.out.println(Arrays.toString(Solution.solution("dxccxbbbxaaaa")));
    }

    class Solution {
        public static String[] solution(String myString) {
            String[] split = myString.split("x");
            List<String> list = new ArrayList<>();

            for (String s : split) {
                if (!s.isEmpty()) {
                    list.add(s);
                }
            }

            Collections.sort(list);

            String[] answer = list.toArray(new String[0]);
            return answer;

            //Stream API 사용
          /*  return Arrays.stream(myString.split("x"))
                    .filter(s -> !s.isEmpty())
                    .sorted()
                    .toArray(String[]::new);*/
        }
    }
}
