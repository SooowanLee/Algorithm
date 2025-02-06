package com.example.algorithm.programmers.level2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P12981_영어_끝말잇기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"})));
        System.out.println(Arrays.toString(Solution.solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"})));
        System.out.println(Arrays.toString(Solution.solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"})));
    }

    class Solution {
        public static int[] solution(int n, String[] words) {
            Set<String> useWords = new HashSet<>();
            useWords.add(words[0]); // 첫 단어는 사용한 단어에 추가

            for (int i = 1; i < words.length; i++) {
                String preWord = words[i - 1]; // 이전 단어
                String currWord = words[i]; // 현재 단어

                // 1. 끝말잇기 규칙 확인(이전 단어의 마지막 글자와 현재 단어의 첫 글자가 일치하는지)
                if (preWord.charAt(preWord.length() - 1) != currWord.charAt(0)) {
                    return new int[]{(i % n + 1), (i / n) + 1};
                }

                // 2. 이전에 등장한 단어는 재사용 불가
                if (useWords.contains(currWord)) {
                    return new int[]{(i % n + 1), (i / n + 1)};
                }

                // 사용한 단어 목록에 추가
                useWords.add(currWord);
            }

            return new int[]{0, 0};
        }
    }
}
