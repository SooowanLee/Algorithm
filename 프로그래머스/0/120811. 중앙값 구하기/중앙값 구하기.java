import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        // 원본 배열을 보존하려면 복사해서 정렬 (코딩테스트는 보존 불필요한 경우가 많음)
        int[] copy = array.clone();      // ← 원본 변형 방지
        Arrays.sort(copy);               // ← O(n log n) 정렬
        return copy[copy.length / 2];    // ← 홀수 길이이므로 가운데 값이 중앙값
    }
}
