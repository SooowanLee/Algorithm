package com.example.algorithms.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P10816_숫자_카드_2 {
    static int lowerBound(int[] a, int key) {
        int lo = 0, hi = a.length;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            // 오버플로우 방지
            if (a[mid] < key) {
                lo = mid + 1;
            // mid 값은 무조건 더 작으므로 왼쪽 검사 생략
            } else {
                hi = mid;
            // mid가 key 이상이면 mid도 가능한 후보
            }
        }
        return lo;
        // lo == hi가 소멸조건, key 이상 첫 위치
    }

    static int upperBound(int[] a, int key) {
        int lo = 0, hi = a.length;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] <= key) {
                lo = mid + 1;
            // mid ≤ key이면 더 오른쪽
            } else {
                hi = mid;
            // mid > key이면 후보, 더 왼쪽 조사
            }
        }
        return lo;
        // key보다 큰 최초 위치 or length
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] cards = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Arrays.sort(cards);

        int M = Integer.parseInt(br.readLine());
        int[] targets = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int target : targets) {
            int count = upperBound(cards, target) - lowerBound(cards, target);
            sb.append(count).append(" ");
        }

        System.out.println(sb);
    }
}
