package com.example.algorithm.programmers.basic_two;

import java.util.HashMap;
import java.util.Map;

public class P120838_모스부호_1 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(".... . .-.. .-.. ---"));
        System.out.println(Solution.solution(".--. -.-- - .... --- -."));
    }

    class Solution {
        public static String solution(String letter) {
            StringBuilder sb = new StringBuilder();
            String[] morse = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
            Map<String, Character> letterMap = new HashMap<>();


            for (int i = 0; i < morse.length; i++) {
                letterMap.put(morse[i], (char) (97 + i));
            }

            String[] split = letter.split(" ");
            for (String s : split) {
               sb.append(letterMap.get(s));
            }


            return sb.toString();
        }
    }
}
