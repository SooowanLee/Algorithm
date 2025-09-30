class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];  // [잔 수, 잔돈]

        // 1잔 가격
        final int PRICE = 5500;

        // 정수 나눗셈: 살 수 있는 잔 수
        int cups = money / PRICE;

        // 나머지 연산: 남는 잔돈
        int change = money % PRICE;

        // 결과 배열에 담기
        answer[0] = cups;
        answer[1] = change;

        return answer;
    }
}