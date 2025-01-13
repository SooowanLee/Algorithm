package com.example.algorithm.programmers.basic_two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P181860_빈_배열에_추가_삭제하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution(new int[]{3, 2, 4, 1, 3}, new boolean[]{true, false, true, false, false})));
    }

    class Solution {
        public static int[] solution(int[] arr, boolean[] flag) {
            List<Integer> arrList = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                if (flag[i]) {
                    for (int j = 0; j < arr[i] * 2; j++) {
                        arrList.add(arr[i]);
                    }
                } else {
                    for (int j = 0; j < arr[i]; j++) {
                        arrList.remove(arrList.size() - 1);
                    }
                    /*int removeCount = arr[i];
                    int currentSize = arrList.size();
                    if (currentSize >= removeCount) { //삭제할 요소가 있는지 확인
                        arrList.subList(currentSize - removeCount, currentSize).clear();
                    }*/
                }
            }

            int[] answer = new int[arrList.size()];
            for (int i = 0; i < arrList.size(); i++) {
                answer[i] = arrList.get(i);
            }

            return answer;
        }
    }
}
