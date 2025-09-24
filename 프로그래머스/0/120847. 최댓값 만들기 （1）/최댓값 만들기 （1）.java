import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        // 배열 오름차순 정렬
        Arrays.sort(numbers);
        
        // 마지막, 마지막 전 값을 추출하기 위한 배열 길이
        int n = numbers.length;
        
        // 배열의 마지막, 마지막 전을 곱한다.
        return numbers[n - 1] * numbers[n - 2];
    }
}