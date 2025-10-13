class Solution {
    public String solution(String my_string, int n) {
        int start = my_string.length() - n;
        return my_string.substring(start); // 끝 인덱스 생략 = 문자열 끝까지
    }
}
