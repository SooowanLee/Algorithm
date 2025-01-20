package com.example.algorithm.programmers.basic_two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P181890_왼쪽_오른쪽 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(new String[]{"u", "u", "l", "r"})));
        System.out.println(Arrays.toString(Solution.solution(new String[]{"l"})));
    }

    class Solution {
        public static String[] solution(String[] str_list) {
            List<String> result = new ArrayList<>();

            for (int i = 0; i < str_list.length; i++) {
                if (str_list[i].equals("l")) {
                    for (int j = 0; j < i; j++) {
                        result.add(str_list[j]);
                    }
                    return result.toArray(new String[0]); //"l"을 찾았으면 리턴
                } else if (str_list[i].equals("r")) {
                    for (int j = i + 1; j < str_list.length; j++) {
                        result.add(str_list[j]);
                    }
                    return result.toArray(new String[0]);
                }
            }

            return new String[0];
        }
    }
}
