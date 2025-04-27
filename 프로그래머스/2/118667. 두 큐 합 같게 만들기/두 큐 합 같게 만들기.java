import java.util.ArrayDeque;
import java.util.Queue;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int n = queue1.length;
        
        // 배열 두 개를 이어붙인 하나의 큰 배열로 취급
        int[] combined = new int[n * 2];
        for (int i = 0; i < n; i++) {
            combined[i] = queue1[i];
            combined[i + n] = queue2[i];
        }

        long sum1 = 0; // 처음 queue1의 합
        long sum2 = 0; // 처음 queue2의 합
        for (int num : queue1) sum1 += num;
        for (int num : queue2) sum2 += num;
        
        long total = sum1 + sum2;
        if (total % 2 != 0) return -1; // 총합이 홀수면 실패

        long target = total / 2; // 목표 합

        // 포인터 설정
        int left = 0; // queue1의 첫 번째 요소
        int right = n; // queue2의 첫 번째 요소
        int count = 0;

        while (left < 2 * n && right < 2 * n) {
            if (sum1 == target) {
                return count;
            }

            if (sum1 > target) {
                sum1 -= combined[left++]; // 왼쪽에서 요소 하나 빼기
            } else {
                sum1 += combined[right++]; // 오른쪽에서 요소 하나 더하기
            }
            count++;
        }

        // 여기까지 와도 못 맞추면
        return -1;
    }
}