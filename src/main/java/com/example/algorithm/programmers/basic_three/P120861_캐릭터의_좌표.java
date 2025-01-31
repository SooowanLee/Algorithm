package com.example.algorithm.programmers.basic_three;

import java.util.Arrays;

public class P120861_캐릭터의_좌표 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(new String[]{"left", "right", "up", "right", "right"}, new int[]{11, 11})));
        System.out.println(Arrays.toString(Solution.solution(new String[]{"down", "down", "down", "down", "down"}, new int[]{7, 9})));
    }

    class Solution {
        public static int[] solution(String[] keyinput, int[] board) {
            int[] answer = new int[2];
            int maxX = board[0] / 2;
            int maxY = board[1] / 2;

            for (String key : keyinput) {
                switch (key) {
                    case "up":
                        if (answer[1] + 1 <= maxY) {
                            answer[1]++;
                        }
                        break;
                    case "down":
                        if (answer[1] - 1 >= -maxY) {
                            answer[1]--;
                        }
                        break;
                    case "left":
                        if (answer[0] - 1 >= -maxX) {
                            answer[0]--;
                        }
                        break;
                    case "right":
                        if (answer[0] + 1 <= maxX) {
                            answer[0]++;
                        }
                        break;
                }
            }

            return answer;
        }
    }
}
