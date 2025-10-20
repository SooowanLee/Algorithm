class Solution {
    public int[] solution(int n) {
        // n까지 존재하는 홀수의 개수: 1,3,5,... => (n + 1) / 2
        int size = (n + 1) / 2;
        int[] answer = new int[size];

        int val = 1;                    // 첫 홀수
        for (int i = 0; i < size; i++) {
            answer[i] = val;            // i번째 칸에 현재 홀수 저장
            val += 2;                   // 다음 홀수(2씩 증가)
        }

        return answer;
    }
}
