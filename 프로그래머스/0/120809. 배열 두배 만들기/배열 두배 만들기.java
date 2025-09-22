import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        return Arrays.stream(numbers)
            .map(n -> n * 2) // 원소마다 2배로 만들기
            .toArray();      // 다시 배열로 만들기
    }
}