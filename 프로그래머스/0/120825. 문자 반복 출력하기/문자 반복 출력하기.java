class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();   // 문자열 덧붙이기는 StringBuilder가 효율적
        for (char c : my_string.toCharArray()) {      // 문자열을 char 배열로 변환
            answer.append(String.valueOf(c).repeat(n)); // char → String 변환 후 repeat()
        }
        return answer.toString();
    }
}
