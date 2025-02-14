package com.example.algorithms.programmers.basic_two;

public class P181881_조건에_맞게_수열_반환하기_2 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(new int[]{1, 2, 3, 100, 99, 98}));
    }

    class Solution {
        public static int solution(int[] arr) {
            int answer = 0;

            while (true) {
                boolean changed = false;

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] >= 50 && arr[i] % 2 == 0) {
                        arr[i] /= 2;
                        changed = true;
                    } else if (arr[i] < 50 && arr[i] % 2 ==1) {
                        arr[i] = (arr[i] * 2) + 1;
                        changed = true;
                    }
                }
                if (!changed) {
                    break;
                }

                answer++;
            }


            return answer;
        }
    }
}
