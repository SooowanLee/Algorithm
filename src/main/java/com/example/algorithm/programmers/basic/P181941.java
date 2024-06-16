package com.example.algorithm.programmers.basic;

public class P181941 {

    /**
     * 문자 리스트를 문자열로 반환하기
     * ["a", "b, "c"] / "abc"
     */
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"a", "b", "c"}));
    }
    static public String solution(String[] arr) {
        return String.join("", arr);
    }
}
