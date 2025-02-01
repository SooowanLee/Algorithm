package com.example.algorithm.programmers.basic_three;

public class P120869_외계어_사전2 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "adio", "soo"}));
        System.out.println(Solution.solution(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"}));
        System.out.println(Solution.solution(new String[]{"s", "o", "m", "d"}, new String[]{"moos", "dzx", "smm", "sunmmo", "som"}));
    }

    class Solution {
        public static int solution(String[] spell, String[] dic) {
            int count = 0;

            for (int i = 0; i < dic.length; i++) {
                for (int j = 0; j < spell.length; j++) {
                    if (dic[i].contains(spell[j])) {
                        count++;
                    }
                }

                if (count == spell.length) {
                    return 1;
                }
            }

            return 2;
        }
    }
}
