import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        // s1을 집합으로: 포함 여부를 O(1) 평균 시간에 확인
        Set<String> set = new HashSet<>(Arrays.asList(s1));
        
        int count = 0;
        for (String v : s2) {
            if (set.contains(v)) { // 공통 원소면 카운트
                count++;
            }
        }
        return count;
    }
}