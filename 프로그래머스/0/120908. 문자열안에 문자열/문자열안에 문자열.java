class Solution {
    public int solution(String str1, String str2) {
        // str1 안에 str2가 포함되어 있으면 true
        // 포함되면 1, 아니면 2 반환
        return str1.contains(str2) ? 1 : 2;
    }
}
