package com.example.algorithms.programmers.level1;

public class P159994_카드_뭉치 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(new String[]{"i", "drink", "water"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));
        System.out.println(Solution.solution(new String[]{"i", "water", "drink"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));
    }

    class Solution {
        public static String solution(String[] cards1, String[] cards2, String[] goal) {
            String answer = "Yes";

            int pos1 = 0, pos2 = 0; // 두 개의 카드 뭉치에서 현재 위치

            for (String word : goal) {
                if (pos1 < cards1.length && cards1[pos1].equals(word)) { // cards1에서 가져올 수 있는 경우
                    pos1++;
                } else if (pos2 < cards2.length && cards2[pos2].equals(word)) {
                    pos2++;
                } else { // 둘 다 아니라면 만들 수 없음
                    answer = "No";
                }
            }

            return answer;
        }
    }
}
