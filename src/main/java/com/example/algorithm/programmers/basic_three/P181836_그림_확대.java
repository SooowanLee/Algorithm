package com.example.algorithm.programmers.basic_three;

import java.util.Arrays;

public class P181836_그림_확대 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(new String[]{
                ".xx...xx.",
                "x..x.x..x",
                "x...x...x",
                ".x.....x.",
                "..x...x..",
                "...x.x...",
                "....x...."}, 2)));
    }

    class Solution {
        public static String[] solution(String[] picture, int k) {
            String[] answer = new String[picture.length * k]; // 결과 배열

            int row = 0;
            for (String line : picture) { // 각 행에 대해 반복
                String newRow = "";
                for (char pixel : line.toCharArray()) { // 각 픽셀에 대해 반복
                    for (int i = 0; i < k; i++) { // 가로 방향으로 k번 반복
                        newRow += pixel;
                    }
                }
                for (int i = 0; i < k; i++) { // 세로 방향으로 k번 반복
                    answer[row++] = newRow;
                }
            }

            return answer;
        }
    }
}
