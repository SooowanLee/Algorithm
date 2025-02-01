package com.example.algorithm.programmers.basic_three;

import java.util.HashMap;
import java.util.Map;

public class P120869_외계어_사전 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "adio", "soo"}));
        System.out.println(Solution.solution(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"}));
        System.out.println(Solution.solution(new String[]{"s", "o", "m", "d"}, new String[]{"moos", "dzx", "smm", "sunmmo", "som"}));
    }

    class Solution {
        public static int solution(String[] spell, String[] dic) {
            int answer = 2;

            for (String word : dic) {
                if (canMakeWord(spell, word)) {
                    answer = 1;
                }
            }

            return answer;
        }

        private static boolean canMakeWord(String[] spell, String word) {
            Map<Character, Integer> spellMap = new HashMap<>();
            for (String s : spell) {
                spellMap.put(s.charAt(0), spellMap.getOrDefault(s.charAt(0), 0) + 1);
            }

            Map<Character, Integer> wordMap = new HashMap<>();
            for (char c : word.toCharArray()) {
                wordMap.put(c, wordMap.getOrDefault(c, 0) + 1);
            }

            if (spellMap.size() != wordMap.size()) {
                return false;
            }

            for (char key : spellMap.keySet()) {
                if (!wordMap.containsKey(key) || spellMap.get(key) != wordMap.get(key)) {
                    return false;
                }
            }

            return true;
        }
    }
}
