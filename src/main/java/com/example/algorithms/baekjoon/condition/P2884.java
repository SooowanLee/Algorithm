package com.example.algorithms.baekjoon.condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2884 {
    public static void main(String[] args) throws IOException {
        /**
         * 알람시계
         * 1. 두 정수 hout, M이 주어진다(0<=hout<=23, 0<=M<=59)
         * 2. 입력 시간은 24시간 표현을 사용한다. 하루 시작은 0:0(자정)
         *    끝은 23:59(다음날 자정 1분 전)이다
         */

        /**
         * 1. 분이 45 미만이면 시--, 60 - (45 - 분)으로 기존의 분 -45분을 한 새로운 분을 구한다.
         * 2. 분이 45 미만이면서 시가 0이면 시를 23으로 바꾼다.
         * 3. 분이 45 초과이면서 시가 0이거나 0이 아니면 시는 그대로, (분 - 45)를 한다.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        final int FORTY_FIVE_MINUTE = 45;
        StringBuilder sb = new StringBuilder();

        //StringTokenizer() 사용
        if (minute < FORTY_FIVE_MINUTE) {
            if (hour == 0) {
                hour = 23;
            } else {
                hour--;
            }
            minute = 60 - (FORTY_FIVE_MINUTE - minute);
            System.out.println(hour + " " + minute);
        } else {
            System.out.println(hour + " " + (minute - FORTY_FIVE_MINUTE));
        }

        //StringBuilder() 사용 <-- 이게 성능이 좀 더 좋다.
//        if (minute < FORTY_FIVE_MINUTE) {
//            if (hour == 0) {
//                hour = 23;
//                sb.append(hour).append(" ");
//            } else {
//                hour--;
//                sb.append(hour).append(" ");
//            }
//            sb.append(60 - (FORTY_FIVE_MINUTE - minute));
//        } else {
//            sb.append(hour).append(" ").append(minute - FORTY_FIVE_MINUTE);
//        }
//
//        System.out.println(sb);
    }
}
