class Solution {
    public String solution(String my_string, String letter) {
        // replace(CharSequence, CharSequence)는 정규식이 아니라 "직접 치환"입니다.
        // letter는 길이 1이 들어오지만, 문자열로 받아도 됩니다.
        return my_string.replace(letter, "");
    }
}