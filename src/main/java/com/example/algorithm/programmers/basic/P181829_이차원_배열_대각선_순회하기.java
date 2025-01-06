package com.example.algorithm.programmers.basic;

public class P181829_이차원_배열_대각선_순회하기 {

    public static void main(String[] args) {
        System.out.println(Solution.solution(new int[][]{
                {0, 1, 2},
                {1, 2, 3},
                {2, 3, 4},
                {3, 4, 5}}, 2));
    }

    /**
     * 첫 번째 for문으로 board의 길이만큼 순회하면서
     * 두 번째 for문을 사용해서 각 행의 길이만큼 순회 하면서
     * i + j 가 k와 같거나 작으면 board[i][j]의 값을 더한다.
     */
    class Solution {
        public static int solution(int[][] board, int k) {
            int answer = 0;

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (i + j <= k) {
                        answer += board[i][j];
                    }
                }
            }


            return answer;
        }
    }
}
