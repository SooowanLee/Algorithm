package com.example.algorithm.programmers.basic_two;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P120864_숨어있는_숫자의_덧셈_2 {
    public static void main(String[] args) {
        System.out.println(Solution.solution("aAb1B2cC34oOp"));
        System.out.println(Solution.solution("1a2b3c4d123Z"));
    }

    class Solution {
        public static int solution(String my_string) {
            int answer = 0;

            //패턴 생성: 하나 이상의 숫자(/d+)
            Pattern pattern = Pattern.compile("\\d+");

            //매처 생성: 문자열과 패턴을 비교할 객체
            Matcher matcher = pattern.matcher(my_string);

            //일치하는 부분 찾기(반복)
            while (matcher.find()) {
                //일치하는 숫자 출력 또는 사용
                String numStr = matcher.group();
                int num = Integer.parseInt(numStr);
                answer += num;
            }

            return answer;
        }
    }
}
