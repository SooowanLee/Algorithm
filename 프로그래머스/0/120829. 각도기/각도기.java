class Solution {
    public int solution(int angle) {
        if (angle > 0 && angle < 90) {
            return 1; // 예각
        } else if (angle == 90) {
            return 2; // 직각
        } else if (angle > 90 && angle < 180) {
            return 3; // 둔각
        } else if (angle == 180) {
            return 4; // 평각
        } else {
            throw new IllegalArgumentException("유효하지 않은 각도입니다."); 
            // 문제 제한사항에선 필요 없지만 안전하게 처리
        }
    }
}