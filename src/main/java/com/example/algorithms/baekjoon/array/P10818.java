package com.example.algorithms.baekjoon.array;

import java.io.IOException;

public class P10818 {
    public static void main(String[] args) throws IOException {
        /**
         * 최소, 최대
         */
        //방법 1
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(min + " " + max);*/

        //방법2
       /* // BufferedReader 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 사용하지 않지만 값 입력
        Integer.parseInt(br.readLine());

        // StringTokenizer로 입력
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 초기값 세팅
        int b = Integer.parseInt(st.nextToken());

        // min, max 변수 선언 및 초기값 설정
        int min = b;
        int max = b;

        // 반복문 실행
        while(st.hasMoreTokens())
        {
            // 데이터 입력
            int a = Integer.parseInt(st.nextToken());

             MIN, MAX를 비교해서 구한다
            if(min > a)
                min = a;

            if(max < a)
                max = a;
        }

        // 결과 출력
        System.out.print(min + " " + max);*/

        //Scanner() + 배열
        /*Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[N -1]);*/

        //배열 + BufferedReader() + StringTokenizer() + Arrays.sort()
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int index = 0;
        int[] arr = new int[N];

        while (st.hasMoreTokens()) {
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }

        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[N - 1]);*/

        //배열X + BufferedReader() + StringTokenizer()
       /* BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int max = -1000001;
        int min = 1000001;

        while (st.hasMoreTokens()) {
            int val = Integer.parseInt(st.nextToken());

            if (val > max) {
                max = val;
            }
            if (val < min) {
                min = val;
            }
        }
        System.out.print(min + " " + max);*/
    }
}
