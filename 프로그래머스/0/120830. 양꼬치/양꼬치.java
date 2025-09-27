class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        // 10인분 마다 음료수 1개 서비스
        int service = n / 10; 
        
        // 고기와 음료 가격을 계산 후 서비스 가격 빼기
        answer = n * 12000 + k * 2000 - service * 2000;
        
        return answer;
    }
}