package com.example.algorithms.programmers.basic_three;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P181851_전국_대회_선발_고사 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(new int[]{3, 7, 2, 5, 4, 6, 1}, new boolean[]{false, true, true, true, true, false, false}));
        System.out.println(Solution.solution(new int[]{1, 2, 3}, new boolean[]{true, true, true}));
        System.out.println(Solution.solution(new int[]{6, 1, 5, 2, 3, 4}, new boolean[]{true, false, true, false, false, true}));
    }


    /**
     * 1. attendance를 돌면서 attendance[i]가 true면 list에 추가
     * 2. Collections.sort()를 사용 Comparator를 rank[a] - rank[b]로 주어 오름차순 한다.
     * 3. list에서 1, 2, 3등 추출
     * 4. answer에 10000 * a + 100 * b + c 추가
     */
    class Solution {
        public static int solution(int[] rank, boolean[] attendance) {
            int answer = 0;
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < rank.length; i++) {
                if (attendance[i]) { // 참석 가능하면
                    list.add(i);
                }
            }

            // 참석 가능한 학생들을 시험 등수(오름차순) 순으로 정렬
            // 등수가 낮은(숫자가 작은) 학생이 더 좋은 성적이므로, 비교 시 rank[a] - rank[b]를 사용
            Collections.sort(list, (a, b) -> rank[a] - rank[b]);

            // 정렬된 리스트에서 상위 3명의 학생 번호를 추출
            int a = list.get(0);
            int b = list.get(1);
            int c = list.get(2);

            answer = 10000 * a + 100 * b + c;
            return answer;
        }
    }
}
