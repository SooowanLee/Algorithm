package com.example.algorithms.baekjoon.advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1316 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        /**
         * 그룹 단어 체커
         *그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
         * 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고,
         * kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
         * aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
         */
        int count = 0;
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            if (check() == true) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean check() throws IOException {
        boolean[] check = new boolean[26];
        int prev = 0;
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i); //i번째 문자 저장 (현재 문자)

            //앞선 문자와 i번째 문자가 같지 않다면?
            if (prev != now) {

                if (check[now - 'a'] == false) { //해당 문자가 처음 나오는 경우(false인 경우)
                    check[now - 'a'] = true;    //true로 변환
                    prev = now;                 //다음 턴을 위해 prev도 바꿔준다
                }

                //해당 문자가 이미 나온 적이 있다면(그룹 단어가 아니게 된다)
                else {
                    return false;
                }
            } else {
                continue;
            }
        }
        return true;
    }
}
