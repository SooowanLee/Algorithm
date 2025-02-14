package com.example.algorithms.baekjoon.string;

import java.io.IOException;

public class P2908 {
    public static void main(String[] args) throws IOException {
        /**
         * 상수
         * 상수는 수를 다른 사람과 다르게 거꾸로 읽는다.
         * 예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다.
         * 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
         */
        //StringBuilder()의 reverse()를 사용하여 쉽게 비교 가능하다.
        //하지만 두 개의 StringBuilder()인스턴스가 필요하다.
        //하나의 StringBuilder() 인스턴스로 비교하려면
        //sb.setLength(0)과 같은 메서드로 초기화를 시키고 다시 값을 할당해야한다.
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        System.out.println(A > B ? A : B);*/
        
        //System.in.read() + 수학 연산
        int A = 0;
        int B = 0;

        A += (System.in.read() - 48);
        A += (System.in.read() - 48) * 10;
        A += (System.in.read() - 48) * 100;

        System.in.read();

        B += (System.in.read() - 48);
        B += (System.in.read() - 48) * 10;
        B += (System.in.read() - 48) * 100;

        System.out.println(A > B ? A : B);



    }
}
